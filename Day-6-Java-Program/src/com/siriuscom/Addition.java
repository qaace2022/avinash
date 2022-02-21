package com.siriuscom;

public class Addition {
	
	//int a, b, c;
	
	public int Addition(int a, int b)
    {
 
        int sum = a + b;
        return sum;
    }
     public int Addition(int a, int b, int c)
    {
 
        int sum = a + b + c;
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition ob = new Addition();
		 
    
        int sum1 = ob.Addition(1, 2);
 
    
        System.out.println("sum of the two integer value :" + sum1);
 
     
        int sum2 = ob.Addition(1, 2, 3);
 
    
        System.out.println(
            "sum of the three integer value :" + sum2);
    }

}