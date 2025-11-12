package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int outCount = 0;
		int antaCount = 0;

		for (int j = 1; j <= 3; j++) {
			
			System.out.println(j+"회 시작합니다");
			

			for (int i = 0;; i++) {
				System.out.println("수비 차례입니다 숫자를 입력하세요 :");
				int deffense = scanner.nextInt();
				int offense = (int) (Math.random() * 10) + 1;

				if (deffense == offense) {

					System.out.println("안타에 성공했습니다!");
					antaCount += 1;
				} else {
					outCount += 1;
					System.out.println("상대의 공은" + offense + "였습니다!");
					System.out.println(outCount+" 아웃");
					if (outCount >= 3) {
						System.out.println("삼진아웃");
						break;
					}
				}

			}
			outCount= 0;
		}
		
	}
}
