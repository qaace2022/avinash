package com.siriuscom;
import java.io.*;
import java.util.Scanner;

public class QuestionTwo {

	BufferedWriter out;

    public QuestionTwo()
    {
        try
            {
                out = new BufferedWriter(new FileWriter("Pattern.txt"));
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

                int i, j, row=4;   
             
                for(i=0; i<row; i++)   
                {   
                	 
                	for(j=0; j<=i; j++)   
                	{   
                		
                		System.out.print("* ");   
                	}   
                	
                	System.out.println();   
                }   

                out.write("");

                out.newLine(); 

                out.close();
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

    public static void main(String[] args)
    {
    	QuestionTwo File = new QuestionTwo();
    }
}
