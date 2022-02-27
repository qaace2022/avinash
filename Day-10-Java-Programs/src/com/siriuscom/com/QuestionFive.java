package com.siriuscom.com;

interface Bank {

	double ROI = 8.5;
	double ROI1 = 10.25;
	double ROI2 = 9.5;

	public void ICICI();

	public void HDFC();

	public void AXIS();

}

public class QuestionFive implements Bank {

	public void ICICI() {

		System.out.println("The interest of ICICI is " + ROI);

	}

	public void AXIS() {

		System.out.println("The interest of AXIS is " + ROI1);

	}

	public void HDFC() {

		System.out.println("The interest of HDFC is " + ROI2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank B1 = new QuestionFive();

		B1.ICICI();

		B1.HDFC();

		B1.AXIS();

	}

}
