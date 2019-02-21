/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Feb 20 2019
 * Created for: ICS4U
 * This program about find max and min number between the range of 1 and 99
 ****************************************************************************/

public class MaxAndMin {

	public static void main(String[] args) {
		
		int array [] = new int[10];
		
		// intro text
		System.out.println("Generate 10 random number, then find out the max and min values: ");
		
		for(int number = 0; number < array.length;number++) {
			array[number] = (int) (Math.random()*99);
		    System.out.println(array[number]);
		}
		
		// recall function
		max(array[0], array);
		min(array[0], array);
			
   }
	// finding max function
	public static void max(int maxValue,int arrays[]) {
		for(int max = 1; max < arrays.length; max++) {
			if(arrays[max] > maxValue) {
				maxValue = arrays[max];
			}	
		
		}
		System.out.println("The max value is: " + maxValue);
	}
	
	// finding min function
	public static void min(int minValue,int arrays[]) {
		for(int min = 1; min < arrays.length; min++) {
			if(arrays[min] < minValue) {
				minValue = arrays[min];
			}

	    }
		System.out.println("The min value is: " + minValue);	
	}
	
}
