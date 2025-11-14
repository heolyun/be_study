package be_study.quiz.Quiz26;

public class Moniter {
	String brand;
	int inch;
	int price;
	String collor;
	int maxX;
	int maxY;

	public Moniter(String brand, int inch, int price, String collor, int maxX, int maxY) {
		this.brand = brand;
		this.inch = inch;
		this.price = price;
		this.collor = collor;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	Moniter(String _brand,int _inch,int _price){
		brand = _brand;
		inch = _inch;
		price = _price;	
	}
	public void setXY(int inputX , int inputY){
		maxX= inputX;
		maxY= inputY;		
	}
	public void setCollor(String inputCollor){
		collor = inputCollor;		
	}
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	void increase(int inputIncrease) {
		price = price + inputIncrease;
		
	}
	public void showInfo() {
	    System.out.println(brand+inch+"인치 "+collor+maxX+"*"+maxY+" 가격:"+price);
	    }
	
}
