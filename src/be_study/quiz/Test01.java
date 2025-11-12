package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int outCount = 0;
		int antaCount = 0;

		for (int i = 0;; i++) {
			System.out.println("수비 차례입니다 숫자를 입력하세요 :");
			int deffense = scanner.nextInt();
			int offense = (int) (Math.random() * 10) + 1;

			if (deffense == offense) {

				System.out.println("안타에 성공했습니다!");
				antaCount += 1;
			} else {
				System.out.println("아웃");
				outCount += 1;
				System.out.println("상대의 공은" + offense + "였습니다!");
				if (outCount >= 3) {
					System.out.println("삼진아웃");
					break;
				}
			}

		}

	}
}
