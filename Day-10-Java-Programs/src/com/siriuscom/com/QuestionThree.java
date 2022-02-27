package com.siriuscom.com;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name;
        int Roll_No, Maths, Physics, English, Biology;
         
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter Student Name: ");
        Name = input.nextLine();
        
        System.out.print("Enter Roll Number: ");
        Roll_No = input.nextInt();
        
        System.out.print("Enter marks in Maths: ");
        Maths = input.nextInt();
        
        System.out.print("Enter marks in Physics: ");
        Physics = input.nextInt();
        
        System.out.print("Enter marks in Chemistry: ");
        English = input.nextInt();
        
        System.out.print("Enter marks in Biology: ");
        Biology = input.nextInt();
         
        int Total = Maths + English + Physics + Biology;
        float Percentage = (float) Total/400*100;
         
        System.out.println("Roll Number:" + Roll_No +"\tName: "+Name);
        System.out.println("Marks (Maths, Physics, Chemistry, Biology): " + Maths +","+Physics+","+English+","+Biology);
        System.out.println("Total: "+Total +"\nPercentage: "+Percentage);

	}

}
