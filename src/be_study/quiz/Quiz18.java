package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String star = "*";
//		for (int i = 5; i >= 1; i--) {
//			System.out.println(star.repeat(i));
//		}
//		//----------------------------------
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(star.repeat(i));
//		}
//		//----------------------------------
//		int num1 = scanner.nextInt();
//		
//		for (int i = 1; i <= num1; i++) {
//			if(num1 % i == 0)
//				System.out.println(i);
//		}
		// -------------------------------------
//		int num2 = scanner.nextInt();
//		for (int i = 1; i <= 2; i++) {
//			if (i==1)
//				for (int j= 0; j < num2 ; j++)
//			       System.out.println(star.repeat(j));
//			else if (i==2)
//				for (int j = num2; j >= 1; j--) {
//					System.out.println(star.repeat(j));
//		}

		// -----------------------------------------------
	    int sum = 0 ;
	    for (int x = 1; x <= 10; x++) {
	    	sum += (11-x)*x;
	    	     
	    }
	     System.out.println(sum);
		// -----------------------------------------------\
		int sum2 = 0;
		for (int i = 1; ; i++) {
			if (i % 2 == 0) {
				sum2 -= i;

			}
			else {
				sum2 += i;
				
			}
			if (sum2 >= 100) {
				System.out.println(i);

				System.out.println(sum2);
				
				break;
			}
			
		}


	}
}
