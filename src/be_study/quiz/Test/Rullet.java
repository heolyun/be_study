package be_study.quiz.Test;

import java.util.Scanner;

public class Rullet {

	String deviceId;
	String branchName;
	int totalPoint;
	int successCount;
	int failedCount;
	int remaining;
	int sales;
	boolean isStart;
	int result = 0;

	public Rullet(String deviceId, String branchName) {
		this.deviceId = deviceId;
		this.branchName = branchName;
		totalPoint = 0;

	}

	public void gamble() {

		while (remaining > 0) {
			for (int i = 1; i <= remaining; i++) {
				result = (int) (Math.random() * 6) + 1;
				System.out.println("룰렛 결과 :" + result);

				remaining -= 1;

				if (result > 4) {
					failedCount += 1;
				}

				if (result <= 4) {
					successCount += 1;
					totalPoint += result;
				}
				showGameInfo();
		}
	}
	}
	Scanner scanner = new Scanner(System.in);

	public void charge() {
		if (remaining>0) {
			System.out.println("게임 잔여 횟수가 아직"+remaining+"회 남았습니다.");
		}
		else {
		System.out.println("충전 금액을 입력하세요 : ");
		int chargedMoney = scanner.nextInt();
		sales += chargedMoney;
		remaining += chargedMoney / 500;
		System.out.printf("매출액 : %d 잔여횟수 : %d \n", sales, remaining);
	}
	}

	public void gameStart() {
	    isStart = true;
	    System.out.println("=======[" + deviceId + " 게임 시작 ]=======");

	    while (isStart) {
	        System.out.println("1. 충전 | 2. 게임플레이 | 3. 종료");
	        int gameInput = scanner.nextInt();
	        
	        switch (gameInput) {
	        case 1:
	            charge();
	            break;
	        case 2:
	            gamble();
	            break;
	        case 3:
	            finishGame();
	            break;
	        default:
	            System.out.println("잘못된 입력입니다.");
	        }
	    }
	}


	public void showGameInfo() {
		System.out.printf("성공횟수: %d 실패횟수: %d 잔여횟수 : %d 현재 점수: %d \n", successCount, failedCount, remaining, totalPoint);
	}

	public void finishGame() {
		if (remaining>0) {
			System.out.println("게임 잔여 횟수가 아직"+remaining+"회 남았습니다.");
		}
		else {
		System.out.println();
		System.out.println("=====[게임종료]=====");
		System.out.println("매출액 : " + sales);
		isStart = false;
		}

	}
}