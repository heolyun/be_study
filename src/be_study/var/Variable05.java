package be_study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		System.out.println("println1");
		System.out.println("println2");
		String s1 = "text test";
		System.out.println(s1);

		System.out.print("print1");
		System.out.print("print2");

		System.out.println("print3"); // \n 으로 줄바꿈 가능

		int hour = 15;
		int minute = 2;

		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n", hour, minute);

		String menu = "멸치밥버거";

		System.out.println("오늘 점심 메뉴는 " + menu + "입니다.");
		System.out.printf("오늘 점심 메뉴는 %s입니다.\n", menu);

		double rate = 3.4612;
		
		System.out.println("오늘 기준 이자율은 "+rate + "% 입니다.");
		System.out.printf("오늘 기준 이자율은 %.4f%% 입니다.\n", rate);
		
		//입력받기 Scanner
		Scanner scanner = new Scanner(System.in);
		
		//int 정수형 scanner.nextInt()
		//double 실수형 scanner.nextDouble()
		//String 문자열 scanner.nextLine()
		
		System.out.println("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
//		System.out.println("당신이 입력한 숫자는 " + number + "입니다.");
		System.out.printf("당신이 입력한 숫자는 %d입니다.\n", number);
		
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한 숫자는 %f입니다.\n", number2);
		
		scanner.nextLine(); // 청소용
		
		String str = scanner.nextLine();
		System.out.printf("입력한 문자열 : ",str);
		}

}
