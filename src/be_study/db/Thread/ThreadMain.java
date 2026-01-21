package be_study.db.Thread;

public class ThreadMain {
	public static void main(String[] args) {
		
	
    Thread01 t1 = new Thread01();
    Thread01 t2 = new Thread01();
    
    
    t1.start();
    t2.start();
    
    //부모타입 변수 = 자식객체
    Thread t3 = new Thread01();
    t3.start();
    
    Thread02 t22 = new Thread02();
    
    Thread t33 = new Thread(t22);
    t33.start();
    
    Thread t44 = new Thread(new Thread02());
    t44.start();
    
    System.out.println(t44.getName());
    System.out.println("Thread Mian Endd -------------");
}
}