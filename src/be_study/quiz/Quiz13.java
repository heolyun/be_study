package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		// -------------------------------------
		int num2 = scanner.nextInt();

		if (num2 % 7 == 0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		// --------------------------------
		int sum = 0;
		for (int i = 0; i <= 1000; i += 5) {
			sum += i;
		}
		System.out.println(sum);
		// -------------------------------------
		int num4 = scanner.nextInt();

		for (; num4 > 0; num4--) {
			System.out.print("*");
		}
		System.out.println();
		// ----------------------------------------
		int num5 = 0;
		for (int i = 0; i <= 10; i++)
			if (i % 2 == 0) {
				num5 -= i;
			} else {
				num5 += i;
			}
		System.out.println(num5);
		// -------------------------------------------
		int num6 = 0;
		for (int i = 0;; i++)
			if (num6 < 1000) {
				num6 += i;
			} else {
				System.out.println(num6);
				break;
			}

		// --------------------------------------------
		int num7 = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num7+"*"+i +"="+num7*i);
		}
	}

	{
	}
}