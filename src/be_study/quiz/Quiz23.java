package be_study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("탑승 인원 :");
		int headCount = scanner.nextInt();
		int[] floor = new int[headCount];
		
		System.out.println("층 수를 입력해주세요 :");
		for (int i = 0; i < headCount; i++) {
		    floor[i] = scanner.nextInt();
		}
		
//		for (int i = 1; i <= 100; i++) {
//			final int current = i;
//            if (Arrays.stream(floor).anyMatch(x -> x == current)) {
//                System.out.println(i+"층 승객이 하차하였습니다"); 
//            } else {
//                System.out.println(i + "층");
//            }
//        }
		for (int i = 1; i <= 100; i++) {
			boolean match = false;
			for (int f : floor) {
				if(f == i) {
					match = true;
					break;
					}
			}	
				if(match) {
					System.out.println(i+"층 승객이 하차하였습니다"); 
				} else {
						System.out.println(i + "층");
					}
				}
			}
		}
    
		    
		
		
		


