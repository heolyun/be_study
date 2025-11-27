package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TempInterface ti = new TemInterface();
		//인터페이스 객체(?) 생성 불가
		
		TempObject to = new TempObject();
		to.method1();
		to.method2();
		
		Temp2Interface ti = new TempObject();
		ti.method1();
		ti.method2();
		//ti.method99();
		

	}

}
