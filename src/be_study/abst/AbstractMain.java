package be_study.abst;

public class AbstractMain {

	public static void main(String[] args) {
		
		//Beverage b1 = new Beverage();
		Hite h1 = new Hite();
		h1.name = "하이트라이트";
		h1.alcol = 5.5;
		h1.introduce();
		
		Coke c1 = new Coke();
		c1.name = "제로콜라";
		c1.ml = 500;
		c1.sugar = 0;
		c1.introduce();
		
		//Beverage b1 = new Beverage();
		Beverage b1 = new Coke();
		Beverage b2 = new Hite();
		Beverage[] bArr= {new Coke(), new Hite()};
		
		//bArr[0].checksafety();
		
		b2.checkSafety();
		b2.introduce();
		//instanceof
		Hite hh = (Hite)b2;
		hh.checkAlcol();
		
		

}
}
