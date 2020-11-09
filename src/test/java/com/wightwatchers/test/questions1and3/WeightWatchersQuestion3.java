package com.wightwatchers.test.questions1and3;

import java.util.Arrays;
import java.util.Random;

import org.testng.annotations.Test;

public class WeightWatchersQuestion3 {
	
	@Test
	public void randomNumbers() {
	     Random randomNumber = new Random();
	      int[] numbersArray = new int[500]; // Array of 500 numbers 
	      int nthSmallestNumber = 5; //nth SmallestNumber
	      for (int i=0; i<=numbersArray.length-1.; i++) 
	      {
	          numbersArray[i] = randomNumber.nextInt(99999); //Storing random numbers in array
	      }
	      Arrays.sort(numbersArray);//sort the random numbers
	      for(int i=0;i<=numbersArray.length-1;i++) {
	    	  System.out.print(numbersArray[i]+" ");//print 500 random numbers stored in the array
	      }
	      System.out.println("\n"+nthSmallestNumber+"'nth' smallest number is "+ numbersArray[nthSmallestNumber-1]);//print value nth smallest number

	}

}
