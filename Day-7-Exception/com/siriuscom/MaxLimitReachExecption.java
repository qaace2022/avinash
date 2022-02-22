package com.siriuscom;

class MaxLimitReached extends Exception{

    public MaxLimitReached(String s) {

        super(s);

    }

}

public class ClassInstanceCountException {
	
	private static int count = 0;

	static void ClassInstanceLimit (int count) throws MaxLimitReached{    
	       if(count > 2){  
	 
	    	throw new MaxLimitReached("You have reached the max limit of creating class instances");
	        
	    }  
	       else { 
	    	   System.out.println("Class instance created:");
	    	      
	        }   
	     }    

    public ClassInstanceCountException()
    {	 
	    	   count++;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ClassInstanceCountException instance1 = new ClassInstanceCountException();
	
			ClassInstanceCountException instance2 = new ClassInstanceCountException();
	
			ClassInstanceCountException instance3 = new ClassInstanceCountException();
			
			ClassInstanceCountException instance4 = new ClassInstanceCountException();
			
			ClassInstanceLimit(ClassInstanceCountException.count);
	
			System.out.print("Number of class instances created are: " + ClassInstanceCountException.count);
		}
		catch (MaxLimitReached ex) {
            
            System.out.println("You have reached the Max limit\n"+ ex;

        }

	}

}