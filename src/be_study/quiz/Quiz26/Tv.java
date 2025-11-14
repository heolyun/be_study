package be_study.quiz.Quiz26;

public class Tv {

	String name;
	int made;
	int inch;
	public Tv(String name, int made, int inch) {
		this.name = name;
		this.made = made;
		this.inch = inch;
	}
	void show() {
		System.out.println(name+"제품 "+made+ "년형 "+inch+"인치 TV");
	}
	

}
