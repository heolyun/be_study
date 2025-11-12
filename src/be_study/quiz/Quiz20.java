package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		int americanoCount = 0,caffeLatteCount = 0,vanillaLatteCount = 0;
		int americanoTotal = 0,caffeLatteTotal = 0,vanillaLatteTotal = 0;
		

		while (running) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 아메리카노 3500원");
			System.out.println("2. 카페라떼 4100원");
			System.out.println("3. 바닐라라떼 4300원");
			System.out.println("===============");
			System.out.println("메뉴 선택 : ");
			String choice = scanner.nextLine();

			System.out.println("수량 선택 : ");
			int quantity = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case "1":
				americanoCount += quantity;
			    americanoTotal += 3500 * quantity;
				break;

			case "2":
				caffeLatteCount += quantity;
				caffeLatteTotal += 4100 * quantity;
				break;

			case "3":
				vanillaLatteCount += quantity;
				vanillaLatteTotal += 4300 * quantity;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("추가 주문 하시겠습니까? (y/n) : ");
			String again = scanner.nextLine();
			if (again.equals("n")) {
		        int total = americanoTotal + caffeLatteTotal + vanillaLatteTotal;

		        System.out.println("====================");
		        if (americanoCount > 0)
		            System.out.println("아메리카노 " + americanoCount + "잔 : " + americanoTotal + "원");
		        if (caffeLatteCount > 0)
		            System.out.println("카페라떼 " + caffeLatteCount + "잔 : " + caffeLatteTotal + "원");
		        if (vanillaLatteCount > 0)
		            System.out.println("바닐라라떼 " + vanillaLatteCount + "잔 : " + vanillaLatteTotal + "원");
		        System.out.println("====================");
		        System.out.println("총액: " + total + "원");

		        running = false;
            }
		}

		scanner.close();
	}
}