package be_study.db.Thread.Case1;

public class Case01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Work work = new Work();
    //int n = 0;
    
    //(w1)Thread1.start() -> Worker.run() -> (addCnt()->Work <- addCnt())
    
    Worker w1 = new Worker("A",30,work);
    Worker w2 = new Worker("B",30,work);
    
    w1.start(); // 쓰레드 실행
    w2.start();
    
	}

}
