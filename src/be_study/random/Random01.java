package be_study.random;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		// Math.random() 0 <= 랜덤값 <1

		// (int)(Math.random()*갯수(범위)) + 시작숫자

		// 1~10까지 중 랜덤
		// (int)(Math.random()*10)+1

		for (int i = 1; i < 10; i++)
			System.out.println((int) Math.random());
		
		for (int i = 1; i < 10; i++) //1~10
			System.out.println((int) Math.random()*10+1);
		
		for (int i = 1; i < 10; i++) // 1~50
			System.out.println((int) Math.random()*100+1);
		for (int i = 1; i < 10; i++) // 101~200
			System.out.println((int) Math.random()*100+101);
		for (int i = 1; i < 10; i++) // 30~50
			System.out.println((int) Math.random()*21+30);
		
		Random random = new Random();
		
		for(int i=1; i<10; i++) // 0~9
			System.out.println(random.nextInt(10));
		for(int i=1; i<10; i++) // 1~10
			System.out.println(random.nextInt(10)+1);
		for(int i=1; i<10; i++) // 10~15
			System.out.println(random.nextInt(6)+10);
		for(int i=1; i<10; i++) // 10~15
			System.out.println(random.nextInt(10, 16));
	}

}
