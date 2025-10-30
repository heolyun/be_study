package be_study.var;

public class Variable01 {

    public static void main(String[] args) {
        // 변수 선언
        int abc;
        int def;
        int point;
        int score;

        score = 90; // score 변수에 값 저장

        int s;
        int x, y, z;

        int level; // 선언 후 사용 가능

        int math = 99; // 선언과 동시에 초기화

        int time;  
        time = 12;
        time = 13; // 값 변경 가능

        int myTime = 10 + 5 - 2; 
        myTime = time + 5;
        myTime = time + 4 + time - 1 + time; // 42

        int value = 20; // 선언 + 초기화
        int result = value + 5; // 25

        // 출력
        System.out.println("문자들 넣으면 출력");
        System.out.println(12345);
        System.out.println(value);
        System.out.println(result);
        System.out.println(result + 50); // 75
        System.out.println(result + value + result + value); // 25+20+25+20 = 90

        int totalScore = score + score + 50; // 90+90+50=230
        System.out.println(totalScore);
        System.out.println(totalScore + 30); // 260
        System.out.println(totalScore); // 230

        totalScore = totalScore + 70; // 300
        System.out.println(totalScore);

        // 값 바꾸기
        int a = 10;
        int b = 20;

        int c = a; // c=10
        a = b;     // a=20
        b = c;     // b=10

        System.out.println(a); // 20
        System.out.println(b); // 10
    }
}
