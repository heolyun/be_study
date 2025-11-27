package be_study.abst;

public abstract class Beverage {
	String name; //이름
	int ml;//용량
	
	public void introduce() {
		System.out.println("저는 음료입니다.");
	

}

	  //안전 검사
	// 추상 메소드
	public abstract void checkSafety();
}
