package be_study.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> scoreMap = new HashMap<>();

		int outCount = 0;
		int antaCount = 0;
		String[] playerName = {"Alpha", "Brabo", "Chalie","Delta","Echo","Fox","Golf","Hotel","India"};
		scoreMap.put("Alpha", 0);
		scoreMap.put("Brabo", 0);
		scoreMap.put("Chalie", 0);
		scoreMap.put("Delta", 0);
		scoreMap.put("Echo", 0);
		scoreMap.put("Fox", 0);
		scoreMap.put("Golf", 0);
		scoreMap.put("Hotel", 0);
		scoreMap.put("India", 0);
		int z = 1;
		int x = 1;

		for (int j = 1; j <= 10; j++) {

			System.out.println(j + "회 시작합니다");

			for (int i = 1;; i++) {
				if (z>10) {z=1; x += 1;}
				int offense = (int) (Math.random() * 10) + 1;
				System.out.println(offense);
				System.out.printf(z+" 번 선수인 "+playerName[z-1]+"의 차례 타율은 "+((double)(scoreMap.get(playerName[z-1])/x))+" 를 기록하고있죠? 숫자를 입력하세요 :");
				int deffense = scanner.nextInt();

				if (deffense == offense) {

					System.out.println("안타에 성공했습니다!");
					scoreMap.put(playerName[z-1],scoreMap.get(playerName[z-1]) +1);
					System.out.println(scoreMap.get(playerName[z-1]));
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
