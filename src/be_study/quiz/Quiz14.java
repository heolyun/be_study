package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] pointArr = new int[5];
		for (int i = 0; i < 5; i++) {
			pointArr[i] = scanner.nextInt();
		}
		System.out.println("몇번째 수 인가요? :");

		System.out.println("결과 :" + pointArr[scanner.nextInt() - 1]);

		// ------------------------------------------
		int[] pointArr2 = new int[5];
		for (int i = 0; i < 5; i++) {
			pointArr2[i] = scanner.nextInt();
		}
		for (int j = 4; j >= 0; j--) {
			System.out.print(pointArr2[j] + " ");
		}
		System.out.println();

		int[][] pointArr3 = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				pointArr3[i][j] = (i * 4) + j + 1;
				System.out.print(pointArr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
