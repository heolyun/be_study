package be_study.var;

public class Variable02 {

	public static void main(String[] args) {

		// 2진수,8진수 ,10진수 ,16진수

		int num2 = 0b10; // 2진수표기로 10 -> 실제 값 2
		int num8 = 012; // 8진수 표기로 12 -> 실제 값 10
		int num10 = 10; // 10
		int num16 = 0x30; // 16진수 표기로 30 -> 실제값 48

		char chr1 = 'A'; // char 타입 (정수타입) : 문자 1개 지정
							// 'A' 작은따옴표로 감싸서 문자 1개
							// 'ABC'-> XXX
		char chr2 = 86; // 본디 정수형이기 때문에 당연히 숫자도 가능
		char chr3 = 0x0123;

		char chr4 = 'F';

		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		char chr5 = '안';

		// 문자열 타입 "" 큰 따옴표로 감싼 여러문자
		String s1 = "안";
		String s2 = "녕";
		String s3 = "안녕하세요";
		String s4 = "1234";

		System.out.println(s3);
		System.out.println(s4);

		int n = 1234;
		System.out.println(n + 10);
		// 1234 + 10 = 1244
		System.out.println(s4 + 10);
		// "1234" +10 = "123410"
		String msg = "\"안녕\"하세요";
		System.out.println(msg);
		
		System.out.println("어서\t오세요~\n반갑습니다.");
		
		double d1 =12.123;
		double d2 = 500.0;
		double d3 = 5e2;
		double d4 = 0.0012;
		double d5 = 0.12E-2;
		
		float f1 = 23.45f;
		
		//논리형 ture false 참 거짓
		boolean open = true;
		boolean close = false;
		boolean stop = false;
		
		boolean isOpen = true;
		boolean isClosed = false;
		
		boolean hasOption = true;
	}
}