package com.siriuscom;

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{69,420,111,450,127,525,333,469};
		
        int smallest = arr[0];

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) 
        {

           if (arr[i] > largest)

              largest = arr[i];

           else if (arr[i] < smallest)

              smallest = arr[i];

        }

        System.out.println("Largest Number is : " + largest);

        System.out.println("Smallest Number is : " + smallest);

	}

}
