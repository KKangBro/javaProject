package argorithm.gun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gun2 {
	static int AnswerN;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/argorithm/gun/input4_총.txt"));

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int k = 1; k <= testCase; k++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			char[][] arr = new char[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = sc.next().charAt(0);
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

			// 구현하시오
			AnswerN = 0;
			int[] x = { -1, 0, 1, 0 };
			int[] y = { 0, -1, 0, 1 };
			int max = row > col ? row : col;

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (arr[i][j] == 'G') {
						// check
						for (int p = 0; p < 4; p++) {
							for (int n = 1; n < max; n++) {
								int nextI = i + x[p] * n;
								int nextJ = j + y[p] * n;
								if (nextI >= 0 && nextJ >= 0 && nextI < row && nextJ < col) {
									if (arr[nextI][nextJ] == 'W' || arr[nextI][nextJ] == 'G')
										break;
									if (arr[nextI][nextJ] == 'T') {
										arr[nextI][nextJ] = '0';
										AnswerN++;
										break;
									}
								}
							}
						}
					}
				}
			}

			System.out.println();
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("#" + k + ":" + AnswerN);
		}

	}

}
