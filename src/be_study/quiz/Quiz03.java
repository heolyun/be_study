package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		int a = 4;
		double b = 3.4;
		String c = "6.8";
	    String result = String.valueOf(a * (int)Double.parseDouble(c))+String.valueOf((int)b)  ;
		System.out.println(result);
	}

}
