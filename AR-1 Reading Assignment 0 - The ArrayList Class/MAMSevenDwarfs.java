package AR_1;

import java.util.ArrayList;

//******************************************************************************************
//MAMSevenDwarfs.java   Author: Mark Mauro 		Section: 02
//
//Represents an ArrayList Demo
//*****************************************************************************************


public class MAMSevenDwarfs {

	public  static void main(String[] args)
	   {
	      ArrayList names = new ArrayList();
	      names.add("Bashful");
	      display(names);
	      names.add("Doc");
	      display(names);
	      names.add("Dopey");
	      display(names);
	      names.add("Grumpy");
	      display(names);
	      names.add("Happy");
	      display(names);
	      names.add("Sleepy");
	      display(names);
	      names.add("Sneezy");
	      display(names);
	      
	   }
	   public static void display(ArrayList names)  
	   {
	      System.out.println("\nThe size of the list is: " + names.size());
	      for(int x = 0; x < names.size(); ++x)
	         System.out.println("position " + x + " Name: " + names.get(x));
	   }

}
