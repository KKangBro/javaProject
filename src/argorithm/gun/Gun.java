package argorithm.gun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gun {
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
//					System.out.print(arr[i][j] + " ");
				}
//				System.out.println();
			}
			// 구현하시오
			AnswerN = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (arr[i][j] == 'G') {
						// checkUp
						for (int n = 1; n < row; n++) {
							if (i - n >= 0) {
								if (arr[i - n][j] == 'W' || arr[i - n][j] == 'G')
									break;
								if (arr[i - n][j] == 'T') {
									arr[i - n][j] = '0';
									AnswerN++;
									break;
								}
							}
						}
						// checkLeft
						for (int n = 1; n < col; n++) {
							if (j - n >= 0) {
								if (arr[i][j - n] == 'W' || arr[i][j - n] == 'G')
									break;
								if (arr[i][j - n] == 'T') {
									arr[i][j - n] = '0';
									AnswerN++;
									break;
								}
							}
						}
						// checkDown
						for (int n = 1; n < row; n++) {
							if (i + n < row) {
								if (arr[i + n][j] == 'W' || arr[i + n][j] == 'G')
									break;
								if (arr[i + n][j] == 'T') {
									arr[i + n][j] = '0';
									AnswerN++;
									break;
								}
							}
						}
						// checkRight
						for (int n = 1; n < col; n++) {
							if (j + n < col) {
								if (arr[i][j + n] == 'W' || arr[i][j + n] == 'G')
									break;
								if (arr[i][j + n] == 'T') {
									arr[i][j + n] = '0';
									AnswerN++;
									break;
								}
							}
						}
					}
				}
			}

			System.out.println("#" + k + ":" + AnswerN);
		}

	}

}
