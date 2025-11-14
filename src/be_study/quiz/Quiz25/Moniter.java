package be_study.quiz.Quiz25;

public class Moniter {
	int inch;
	String brand;
	String model;

	public Moniter(int inch, String brand, String model) {
		this.inch = inch;
		this.brand = brand;
		this.model = model;
	}

	void printInfo() {

		System.out.println("제조사 : " + brand);
		System.out.println("모델명 : " + model);
		System.out.println("인치 : " + inch);
	}

}
