package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {

		//산술 (+ - * / % )
		
		System.out.println( 1+1 );
		System.out.println( 10-5 );
		System.out.println( 5*9 );
		System.out.println( 30/7 );
		System.out.println( (double)30/7 );
		System.out.println( 30/7.0  );
		System.out.println( 9%5 );
		System.out.println( 28%9 );
		
		//부호 ( +  - )
		System.out.println( 10 );
		System.out.println( +10 );
		System.out.println( -10 );
		System.out.println( -(-10) );
		
		//증감 ++ --   1증가 1감소
		// ++변수  증가먼저
		// 변수++	  증가나중에
		
		System.out.println("=============================");
		
		int x = 10;
		System.out.println( x ); // 10
		System.out.println( ++x ); // 11
		System.out.println( x ); // x:11
		
		System.out.println( 1+x );
		System.out.println( x );
								// x:11
		System.out.println( x++ );
		System.out.println( x );
		
		int y = 8;
		System.out.println( y-- ); // 8
		System.out.println( --y ); // 6 
		System.out.println( y ); //   6
		
		int z = 30;
		System.out.println( z + 1 ); //31
		System.out.println( z++ );   //30
		System.out.println( z );     //31
		
		z++;
		++z;
		z = z + 1;
		
		int q = 1; // 2
		int w = 3; // 2
		int e = 10 + ++q; // 10 + 2 = 12
		int r = 3 + w--;  // 3 + 3 = 6
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		//					               2  2  12 6 
		
		//논리 부정  !     true false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		isHungry = !isHungry;
		
		//문자열 결합 연산자   + 
		System.out.println(133 + 3.345 + "문자");
		
		
		//비교
		System.out.println( 1 == 2);
		System.out.println( 1 != 2);
		System.out.println( 3 < 5);
		System.out.println( 10 >= 9);
		System.out.println( 4 > 4 );
		System.out.println( 9 <= 1);
		boolean b1 = ( 9 > 8 );
		
		//논리
		// AND &&   OR ||
		
		boolean b2 = (10 > 6) && ( 10>5 );
		//				true  &&   true  => true
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || (10 < 4);
		//			  true    ||  false  => true
		System.out.println(b3);
		
		boolean b4 = (2 >= 1) && !(3<4);
		//			  true    &&  false   => false
		System.out.println(b4);
		
		//대입
		int a = 30;
		a = 50;
		
		a += 30;	// a = a + 30
		a -= 10;	// a = a - 10
		a *= 3;		// a = a * 3
		a /= 2;		// a = a / 2
		a %= 4;		// a = a % 4 
		
		
		//삼항 연산자 (조건)
		int point = 300; //포인트
		
		// 포인트 200점까지는 사은품 생수 0~200
		// 200점 넘으면? 커피  201~
		
		// 조건식 ? 앞 : 뒤 
		//        참   거짓 
		
		String eventItem = (point > 200) ? "커피" : "생수";   
		System.out.println(eventItem);
		
		eventItem = point <= 200 ? "생수" : "커피";
		System.out.println(eventItem);
		
		System.out.println( point > 50 ? "단골" : "신규" );
		
		/*
			(조건식) ? 참 : 거짓
			
			(조건식) ? 참 : ( (조건식) ? ( (조건식) ? 참 : 거짓 ) : 거짓 ) 
		 */
		
		
		// 0~200 : 생수
		// 201~300 : 커피
		// 301~    : 맥주
		
		point = 550;
		
		//삼항연산자 조건식
		System.out.println( point <= 200 ? "생수" : (point > 300 ? "맥주" : "커피") );
		
		
		int num = 10;
		System.out.println(  num < 0 ? "음수" : "양수" );
		
		// 음수 0 양수
	
		System.out.println( num == 0 ? "0" : ( num > 0 ? "양수" : "음수" ));
		System.out.println( num != 0 ? ( num < 0 ? "음수" : "양수") : "0");
		
		System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : "0") );
		System.out.println( num >= 0 ? (num == 0 ? "0" : "양수") : "음수");
		
		
		
	}

}





