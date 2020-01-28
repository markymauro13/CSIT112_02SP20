//******************************************************************************************
// PrintRunTimes.java   Author: Mark Mauro 		Section: 02
//
// Write three statements to print the first three elements of array runTimes. 
//
//*****************************************************************************************

import java.util.Scanner;

public class PrintRunTimes {
   public static void main (String [] args) {
      int[] runTimes = new int[5];

      // Populate array
      runTimes[0] = 800;
      runTimes[1] = 775;
      runTimes[2] = 790;
      runTimes[3] = 805;
      runTimes[4] = 808;

      /* Your solution goes here  */
 
      for(int i = 0; i < 3; i++) {
    	  System.out.println(runTimes[i]);
      }
   }
