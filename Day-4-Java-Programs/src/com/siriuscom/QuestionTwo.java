package com.siriuscom;

public class QuestionTwo {
 
		static int count=0;  
		
		public static void main(String args[])  
		{  
			
		QuestionTwo c1=new QuestionTwo();   
		c1.count();  
		QuestionTwo c2=new QuestionTwo();  
		c2.count();  
		QuestionTwo c3=new QuestionTwo();   
		c3.count();
		QuestionTwo c4=new QuestionTwo();   
		c4.count();  
		QuestionTwo c5=new QuestionTwo();  
		c5.count();  
		QuestionTwo c6=new QuestionTwo();   
		c6.count();  
		
		System.out.println("Total Number of Objects: "+count);  
		
		}  
		
		static void count()  
		{  
			
		count++;  
		
		}  

}
