package be_study.inherit.inherit01;

public class Parent extends GrandParent {
	//private int money; // 상속 X
	int money;
	
	public Parent() {
		System.out.println("Parent 생성자 실행됨");
	}
	
	public Parent(int money) {
		System.out.println("Parent(int money) 생성");
		this.money = money;
	}
	

	}
