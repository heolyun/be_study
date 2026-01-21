package be_study.db.Thread.Case1;

public class Worker extends Thread {
	
	String name;
	int workLoad;
	Work work;
	public Worker(String name, int workLoad, Work work) {
		super();
		this.name = name;
		this.workLoad = workLoad;
		this.work = work;
	}
	public void run() {
		for(int i=1; i<=workLoad ;i++) {
			try {
				Thread.sleep(300);
				
			} catch (Exception e) {
                 e.printStackTrace();
			} 
			synchronized (work) {
				work.addCount();
				System.out.println(name+""+work.workCount);
				
			}
		}
		
	}
	

}
