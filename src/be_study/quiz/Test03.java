package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int outCount = 0;
		int antaCount = 0;
		String[] playerName = {"A", "B", "C","D","E","F","G","H","I"};
		int z = 1;

		for (int j = 1; j <= 3; j++) {

			System.out.println(j + "회 시작합니다");

			for (int i = 0;; i++) {
				if (z==10) {z=1;}
				System.out.println(z+" 번 선수인 "+playerName[z-1]+"의 차례입니다 숫자를 입력하세요 :");
				int deffense = scanner.nextInt();
				int offense = (int) (Math.random() * 10) + 1;

				if (deffense == offense) {

					System.out.println("안타에 성공했습니다!");
					antaCount += 1;
					z++;
				} else {
					outCount += 1;
					System.out.println("상대의 공은" + offense + "였습니다!");
					System.out.println(outCount + " 아웃");
					z++;
					if (outCount >= 3) {
						System.out.println("삼진아웃");
						break;
					}
				}

			}
			outCount = 0;
		}

	}
}
