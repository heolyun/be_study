package be_study.quiz;
import java.util.Scanner;

public class Quiz05{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = 10;
//
//		System.out.println(num > 0 ? "양수" : (num == 0 ? "0" : "음수"));
//		

		
		System.out.print("첫번째 숫자를 입력하세요 :");
		
		int num1 = sc.nextInt(); 
		
		System.out.print("두번째 숫자를 입력하세요 :");
		int num2 = sc.nextInt(); 
		

		System.out.println("더하기 :"+ String.valueOf(num1)+"+"+String.valueOf(num2)+"="+(num1+num2));
		System.out.println("빼기 :"+ String.valueOf(num1)+"-"+String.valueOf(num2)+"="+(num1-num2));
		System.out.println("곱하기 :"+ String.valueOf(num1)+"*"+String.valueOf(num2)+"="+(num1*num2));
		System.out.println("나누기 :"+ String.valueOf(num1)+"/"+String.valueOf(num2)+"="+(double)(num1/num2));
		
//		System.out.println("더하기 :"+ num1+"+"+num2+"="+(num1+num2)); <<만들다보니 String.valueOf를 해줄 필요가 없었음
		

	}

}