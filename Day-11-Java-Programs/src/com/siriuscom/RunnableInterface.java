package com.siriuscom;

public class RunnableInterface implements Runnable {

	public void run() {
		
		for(int i=0;i<=3;i++) {
			
			System.out.println(i);
		}
		try {
			
			Thread.sleep(100);
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableInterface RI1 = new RunnableInterface();
		Thread t1 = new Thread(RI1);
		t1.start();

		RunnableInterface RI2 = new RunnableInterface();
		Thread t2 = new Thread(RI2);
		t2.start();

	}

}
