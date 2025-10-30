package be_study.var;

public class Variable02 {

    public static void main(String[] args) {

        // 2진수, 8진수, 10진수, 16진수
        int num2 = 0b10;   // 2진수 -> 값 2
        int num8 = 012;    // 8진수 -> 값 10
        int num10 = 10;    // 10진수
        int num16 = 0x30;  // 16진수 -> 값 48

        // char 타입 (문자 1개)
        char chr1 = 'A';
        char chr2 = 86;    // 정수도 가능
        char chr3 = 0x0123;
        char chr4 = 'F';
        char chr5 = '안';

        System.out.println(chr1);
        System.out.println(chr2);
        System.out.println(chr3);
        System.out.println(chr4);
        System.out.println(chr5);

        // 문자열 타입 (여러 문자)
        String s1 = "안";
        String s2 = "녕";
        String s3 = "안녕하세요~";
        String s4 = "1234";

        System.out.println(s3);
        System.out.println(s4);

        // 정수 연산
        int n = 1234;
        System.out.println(n + 10);   // 1244
        System.out.println(s4 + 10);  // "123410"

        System.out.println("지금은 " + 16 + "시 입니다.");
        String msg = "\"안녕\"하세요";
        System.out.println(msg);

        System.out.println("어서\t오세요~\n반갑습니다.");

        // 실수 타입
        double d1 = 12.123;
        double d2 = 500.0;
        double d3 = 5e2;       // 5 * 10^2
        double d4 = 0.0012;
        double d5 = 0.12E-2;   // 0.12 * 10^-2
        float f1 = 23.45f;     // float 타입은 f 필요

        // 논리형 true/false
        boolean open = true;
        boolean close = false;
        boolean stop = false;
        boolean isOpen = true;
        boolean isClosed = false;
        boolean hasOption = true;
    }
}
