package be_study.quiz;

import java.util.Arrays;

public class Quiz22 {

	public static void main(String[] args) {
		int[] scores = { 88, 92, 75, 63, 95, 70, 85, 90, 100, 67 };
		int total = 0;
		int avgCount = 0;
		for (int i = 0; i <scores.length; i++) {
			total += scores[i];
			
			if(scores[i] >= 80) {
				avgCount++;
			}
		}

		Arrays.sort(scores);

		System.out.println("최고 점수 : " + scores[0]);
		System.out.println("최저 점수 : " + scores[9]);
		System.out.println("평균 점수 : " + ((double)total/scores.length));
		System.out.println("평균 이상 수 : " + avgCount);
		

	}

}
