package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		if (year%400==0) { System.out.println("윤달입니다");}
		    else if (year%100==0) {
				System.out.println("윤달이 아닙니다");
			} else if (year% 4 == 0) {
				System.out.println("윤달입니다");
			}
			else {
				System.out.println("윤달이 아닙니다");
		}

	}
}

