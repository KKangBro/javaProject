package argorithm.gijigook;

import java.util.*;

public class Gijigook {
	static int N;
	static int AnswerN;
	static int x, y;
	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int n = 1; n <= testCase; n++) {
			AnswerN = 0;
			N = sc.nextInt();
			map = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
//                    System.out.print(map[i][j]);
					if (map[i][j] == 'H')
						AnswerN++;
				}
//				System.out.println();
			}
			// 구현
			for (x = 0; x < N; x++) {
				for (y = 0; y < N; y++) {
					run(map[x][y]);
				}
			}
			// 출력
			System.out.println(n + "..결과 =>\n커버되지 않는 집의 수는 " + AnswerN + "입니다.\n");
		}
	}

	private static void run(char c) {
		if (c == 'A')
			check(1);
		else if (c == 'B')
			check(2);
		else if (c == 'C')
			check(3);
		else
			return;
	}

	private static void check(int i) {
//        System.out.println(i + " check=\tx: " + x + " y: " + y);
		for (int j = 1; j <= i; j++) {
			// x<0, y<0, x>=N, y>=N -> X
			if (x - j >= 0 && map[x - j][y] == 'H') {
				map[x - j][y] = 'X';
				AnswerN--;
			}
			if (y - j >= 0 && map[x][y - j] == 'H') {
				map[x][y - j] = 'X';
				AnswerN--;
			}
			if (x + j < N && map[x + j][y] == 'H') {
				map[x + j][y] = 'X';
				AnswerN--;
			}
			if (y + j < N && map[x][y + j] == 'H') {
				map[x][y + j] = 'X';
				AnswerN--;
			}
		}
	}
}
