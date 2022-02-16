package com.siriuscom;
import java.util.Arrays;

public class SumAndProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {6,9,4,6,9};
        
		int sum = 0;
		
		int product = 1;
		
		for(int x: arr)
		{
		  sum += x;
		  product *= x;

		}
		
		System.out.println("Pre-defined Array: " + Arrays.toString(arr));

		System.out.println("Sum of array elements: " + sum);

		System.out.println("Product of array elements: " + product);

	}

}
