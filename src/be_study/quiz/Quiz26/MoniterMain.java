package be_study.quiz.Quiz26;

public class MoniterMain {

	public static void main(String[] args) {
		Moniter moniter1 = new Moniter("삼성",27,150000);
		moniter1.setCollor(" 검은색 ");
		moniter1.setXY(1080, 780);
		moniter1.showInfo();
		Moniter moniter2 = new Moniter("LG",32,330000);
		moniter2.setCollor(" 흰색 ");
		moniter2.setXY(4096,2048);
		moniter2.showInfo();
		moniter2.increase(70000);
		moniter2.showInfo();
	

	}

}
