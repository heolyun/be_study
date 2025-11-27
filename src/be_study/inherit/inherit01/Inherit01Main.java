package be_study.inherit.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.money = 5000;
		
		Child c1 = new Child();
		c1.schoolName = "중앙초등학교";
		c1.grade = 3;
		c1.money = 1000;
		c1.play();
		c1.say();
		
		Child c2 = new Child("서초동", 5, 1000 , 5);
		c2.say();
		c2.play();
		c2.age = 5;
		System.out.println(c2.grade);
		System.out.println(c2.schoolName);
		System.out.println(c2.money);
		System.out.println(c2.age);
		
		c2.printInfo();//가지고 있는 정보 출력
		

	}

}
