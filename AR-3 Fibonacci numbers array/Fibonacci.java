//******************************************************************************************
// Fibonacci.java   Author: Mark Mauro    Section: Your section number
//
// Represents the first n integers of the Fibonacci series and prints them

// then prints the nth number selected by the user
//*****************************************************************************************

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int limit = 20;
		long[] series = new long[limit];

		//create first 2 series elements
		series[0] = 0;
		series[1] = 1;
		
		for(int i = 2; i < series.length; i++) {
			series[i] = series[i-1] + series[i-2];
			
		}
		
		for(int i = 0; i < series.length; i++) {
			System.out.print(series[i] + ", ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("What number in this series would you like to see?");
		int q = sc.nextInt();
		if(q < 1 || q > 20) {
			System.out.println("You entered an invalid number.");
		}
		else {
			System.out.println("The " + q + "th Fibonacci number is " + series[q-1]);
		}
	}

}
