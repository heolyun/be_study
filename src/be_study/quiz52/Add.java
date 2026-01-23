package be_study.quiz52;

public class Add extends Thread {
	public void run(){
		for(int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
}}
