package com.siriuscom;

public class Multiplication {
	//int a, b, c;
	
	public int Multiplication(int a, int b)
    {
 
        int mul  = a * b;
        return mul;
    }
 
  
    public int Multiplication(int a, int b, int c)
    {
 
        int mul = a * b * c;
        return mul;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication ob = new Multiplication();
		  
        int mul1 = ob.Multiplication(10, 5);
 

        System.out.println("Multiplication of the two integer value :" + mul1);
 
    
        int mul2 = ob.Multiplication(10, 5, 3);
 
     
        System.out.println("Multiplication of the three integer value :" + mul2);

	}


}
