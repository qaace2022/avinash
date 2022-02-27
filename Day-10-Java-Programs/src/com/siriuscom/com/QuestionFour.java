package com.siriuscom.com;

public class QuestionFour {
	
	private static void Show(int num1,int num2,int num3){
		int sum = num1 + num2 + num3;
        System.out.println("Addition of 3 numbers: " + sum);
    }

    private static void Show(String name){
    	System.out.println("Student Name is : " + name);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Show(69,4,20);
		Show("AwesMosian");

	}

}
