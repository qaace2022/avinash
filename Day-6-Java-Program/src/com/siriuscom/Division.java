package com.siriuscom;

public class Division {
	//int a, b, c;
	
	public int Division(int a, int b)
    {
 
        int div  = a / b;
        return div;
    }
 
  
    public float Division(float a, float b)
    {
 
        float div = a / b ;
        return div;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Division ob = new Division();
		  
        int div1 = ob.Division(10, 5);
 

        System.out.println("Division of the two integer value :" + div1);
 
    
        int div2 = ob.Division(10, 3);
 
     
        System.out.println("Division of the two float value :" + div2);

	}

}