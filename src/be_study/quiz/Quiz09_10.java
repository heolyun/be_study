package be_study.quiz;

import java.util.Scanner;

public class Quiz09_10 {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("1)" + i);
//		}
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("2)" + i);
//		}
//		for (int i = 10; i <= 100; i += 10) {
//			System.out.println("3)" + i);
//		}
//		for (int i = 25; i <= 100; i += 25) {
//			System.out.println("4)" + i);
//		}
//
//		int i = 50;
//		while (i <= 55) {
//			System.out.println("5)"+i);
//			i++;
//		}
//		int i2 = 10;
//		while (i2 >= 1) {
//			System.out.println("6)"+i2);
//			i2--;
//		}
//		int i3 = 30;
//		while (i3 >= 0) {
//			System.out.println("7)"+i3);
//			i3-= 5;
//
//		}
//		int i4 = 30;
//		while (i4 >= 5) {
//			System.out.println("8)"+i4);
//			i4-= 5;
//
//		}
//		int i5 = 25;
//		while (i5 >= 0) {
//			System.out.println("9)"+i5);
//			i5-= 5;
//
//		}
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어점수: ");
		int num1 = scanner.nextInt();

		System.out.print("수학점수: ");
		int num2 = scanner.nextInt();

		System.out.print("영어점수: ");
		int num3 = scanner.nextInt();

		int sum = num1 + num2 + num3;
		double aver = (double) sum / 3;

		if (num1 >= 40 && num2 >= 40 && num3 >= 40) {
			if (sum >= 180) {
				System.out.println("국어 :"+num1);
				System.out.println("수학 :"+num2);
				System.out.println("영어 :"+num3);
				System.out.println("합계 :"+sum);
				System.out.println("평균 :"+aver);
				System.out.println("축하합니다.합격입니다");
			} else {
				System.out.println("불합격입니다");
			}
		}
		scanner.close();
	}

}
