package com.siriuscom;

public class ThreadClass extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Start new thread");
			
		}
		try {
			
			ThreadClass.sleep(3000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadClass TC = new ThreadClass();

		System.out.println("State: " + TC.getState());

		TC.start();

	}

}