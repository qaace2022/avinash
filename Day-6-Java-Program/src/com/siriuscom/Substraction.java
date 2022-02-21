package com.siriuscom;

public class Substraction {
	//int a, b, c;
	
	public int Substraction(int a, int b)
    {
 
        int sub  = a - b;
        return sub;
    }
 
  
    public int Substraction(int a, int b, int c)
    {
 
        int sub = a - b - c;
        return sub;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction ob = new Substraction();
  
        int sub1 = ob.Substraction(10, 5);
 

        System.out.println("substraction of the two integer value :" + sub1);
 
    
        int sub2 = ob.Substraction(10, 5, 3);
 
     
        System.out.println("substraction of the three integer value :" + sub2);

	}

}
