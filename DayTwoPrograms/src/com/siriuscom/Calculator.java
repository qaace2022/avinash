package com.siriuscom;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=0.0, num2=0.0;
		char operator='\0';
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter two numbers for calculations: ");
	      num1 = scan.nextDouble();
	      num2 = scan.nextDouble();

	      System.out.println("Available Operators" + "are::  (+ - * / % ^)");
	      System.out.print("Choose operator: ");
	      operator = scan.next().charAt(0);
	      
	      switch(operator) {
	      	case '+':
	    	  System.out.println("Result = "+ (num1+num2));
	    	  break;
	    	  
			case '-':
			    System.out.println("Result = "+ (num1-num2));
				break;
				
			case '*':
			    System.out.println("Result = "+ (num1*num2));
				break;
			
			case '/':
			    System.out.println("Result = "+ (num1/num2));
				break;
				
			case '%':
			    System.out.println("Result = "+ (num1%num2));
			    break;
			    
			case '^':
			    System.out.println("Result = "+ Math.pow(num1,num2));
				break;
				
			default:
			    System.out.println("Invalid operator");
		}
	      scan.close();
	      
	}
	
}
