package be_study.db.Thread.Case1;

public class Work {
    int workCount;
    
    public Work() {
    	workCount = 0;
    }
    public synchronized void addCount() {
    	workCount++;
    }
    

}
