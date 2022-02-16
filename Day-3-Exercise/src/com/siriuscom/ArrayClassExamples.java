package com.siriuscom;
import java.util.Arrays;

public class ArrayClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str[] = {"AwesMosian", "Mendises", "Legend", "LegendProMax", "Fauji"};

	    System.out.println("original string array is: "+ Arrays.toString(str));

	    System.out.println("copied range of array is: "+ Arrays.toString(Arrays.copyOfRange(str,0,2)));
	    
	    System.out.println("the array is converted to list is:" + Arrays.asList(str) );
	    
	    Arrays.sort(str);

	    System.out.println("Sorted Array:" + Arrays.toString(str));

	    
	}

}
