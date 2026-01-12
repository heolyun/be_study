package be_study.exp;

import java.util.List;

public class Exp03 {
	public static void main(String[] args) {
		SampleEx s = new SampleEx();
		
		try {
			s.addItem1("하나");
		}catch(Exception e) {
			System.out.println("addItem1을 호출한 main에서 하나 예외처리");
		}
		try {
			s.addItem1("둘");
		}catch(Exception e) {
			System.out.println("addItem1을 호출한 main에서 둘 예외처리");
		}
        try {
        	s.addItem3("셋");
        }catch(Exception e) {
			e.printStackTrace();
		}
        s.addItem4("넷");
        try {
			s.addItem5("다섯");
		}catch(Exception e) {
			System.out.println("addItem1을 호출한 main에서 다섯 예외처리");
		}
		try {
				s.addItem6("여섯");
		}catch(Exception e) {
			System.out.println("addItem1을 호출한 main에서 둘여섯예외처리");	
		
		}
		int result = s.addItem7("일곱");
		if(result == 1) {
			//O 정상 처리
		}else {
			//X Exception
		}
		
		try {
			s.addItem8("여덟");
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		} catch (ListFullException e) {
			e.printStackTrace();
		}
		
	}
}


/********************************************/

class SampleEx {
	
	List<String>list;
	
	void addItem1(String s) {
		list.add(s);
	}
	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem2에서 예외처리");
		}
	}
	void addItem3(String s)throws Exception{
		list.add(s);
	}
	void addItem4(String s)throws NullPointerException{
		list.add(s);
	}
	void addItem5(String s)throws Exception {
		try {
			list.add(s);
		}catch (Exception e) {
			System.out.println("SampleEx 내부 addItem5에서 예외처리");
		}
	}
	
	                        // 이 메소드에서 이 예외가 발생할수 있음 주의 = throws
	void addItem6(String s)throws Exception {
		try {
			list.add(s);
		}catch (Exception e) {
			System.out.println("SampleEx 내부 addItem6에서 예외처리");
			throw e;//실제 예외를 던진다(발생시킨다/전달한다)
		}
	}
	
	int addItem7(String s) {
		try {
			list.add(s);
		}catch (Exception e) {
			//문제발생
			return -1; // -1 예외발생 잘못됐다
		}
		return 1; //정상~처리 반환 :1
	}
	void addItem8(String s)throws InvlidParameterValueException,ListFullException{
		if (s = null) {
			throw new InvlidParameterValueException();
		}
		try {
			list.add(s);
		} catch (Exception e) {
			//우리가 저장하는 최대길이
			// 현재 리스트 길이
			//문제가 발생
			throw new ListFullException();
		}
	}
}
/**************************************/
//Custom Exception

class ListFullException extends Exception {}

class InvlidParameterValueException extends Exception{}

class SuperThirthyException extends Exception{}