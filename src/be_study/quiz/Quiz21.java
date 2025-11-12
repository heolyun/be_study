package be_study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		// ----------------------------------
//		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j < 7; j++) {
//				if (i + j == 6) {
//					System.out.print(i);
//					System.out.print(j + " ");
//				}
//			}
//		}
		// -------------------------------------------
//		int[] lotto = new int[6];
//		int count = 0;
//
//		while (count < 6) {
//		    int num = (int)(Math.random() * 45) + 1;
//		    boolean duplicate = false;
//
//		    for (int i = 0; i < count; i++) {
//		        if (lotto[i] == num) {
//		            duplicate = true;
//		            break;
//		        }
//		    }
//
//		    if (!duplicate) {
//		        lotto[count] = num;
//		        count++;
//		    }
//		}
//	    System.out.print(Arrays.toString(lotto));
		// --------------------------------------------
//		Scanner scanner = new Scanner(System.in);
//		int firstTotal = 0, secondTotal = 0, thirdTotal = 0;
//		for (int i = 1; i <= 3; i++) {
//		    System.out.println(i + "반 점수 입력 :");
//		    for (int j = 1; j <= 5; j++) {
//		        int score = scanner.nextInt();
//		        if (i == 1) firstTotal += score;
//		        else if (i == 2) secondTotal += score;
//		        else if (i == 3) thirdTotal += score;}
//		}
//		int Total = firstTotal + secondTotal + thirdTotal;
//		System.out.println("1반 평균 :" + (firstTotal /5.0));
//		System.out.println("2반 평균 :" + (secondTotal /5.0));
//		System.out.println("3반 평균 :" + (thirdTotal /5.0));
//		System.out.println("전체 평균 :" + (Total / 15.0));
//
//		scanner.close();
		// --------------------------------------------------
		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };

		int rows = arr.length + 1;
		int cols = arr[0].length + 1;
		int[][] newArr = new int[rows][cols];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArr[i][j] = arr[i][j];
			}
		}
		int rowSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			newArr[i][cols - 1] = rowSum;
		}
		int colSum = 0;
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				colSum += arr[i][j];
			}
			newArr[rows - 1][j] = colSum;
		}
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				totalSum += arr[i][j];
			}
		}
		newArr[rows - 1][cols - 1] = totalSum;
		
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();

		}
	}
}
