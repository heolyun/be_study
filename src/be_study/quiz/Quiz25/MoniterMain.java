package be_study.quiz.Quiz25;

public class MoniterMain {

	public static void main(String[] args) {
		Moniter moniter1 = new Moniter(65, "삼성", "더프레임");
		Moniter moniter2 = new Moniter(80, "LG", "올레드");

		moniter1.printInfo();
		System.out.println();
		moniter2.printInfo();

	}

}
