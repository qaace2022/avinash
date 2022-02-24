package com.siriuscom;
import java.io.*;
import java.util.Scanner;


public class QuestionOne {

	BufferedWriter out;

		    public QuestionOne()
		    {
		        try
		            {
		                out = new BufferedWriter(new FileWriter("Team.txt"));
		                
		                String userInput = ("");
		        
		                Scanner input = new Scanner(System.in);

		                System.out.println("Please enter the team name: ");
		                userInput = input.nextLine();

		                System.out.println("Please enter the city name: ");
		                userInput = input.nextLine();

		                System.out.println("Please enter the slogan: ");
		                userInput = input.nextLine();

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
		    	QuestionOne File = new QuestionOne();
		    }
}

