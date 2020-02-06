

public class MAM2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = {
				
				{"a", "b", "c"},
				{"d", "e", "f"},
				{"g", "h", "i"},
				
		};
		
		// First Determinant
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				if(row == col) {
					System.out.print(arr[row][col] + " ");
				}
				
			}
		}
		
		System.out.println();
		
		// Second Determinant 
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				if ((row + col) == (arr.length - 1))  { 
                    System.out.print(arr[row][col] + ", "); 
				} 
			}
		}
		
		String[][] poem = {
				{"Roses", "are", "red"},
				{"Violets", "are", "blue"},
				{"I've", "never", "found", "someone", "as", "patient"},
				{"but", "I", "have", "commitment", "issues"},
		};
	
		System.out.println("\n");
		
		//  Substitute "but I have commitment issues"  for the last line  in the above poem  and print the whole poem.
		for(int row = 0; row < poem.length; row++) {
			for(int col = 0; col < poem[row].length; col++) {
				System.out.print(poem[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
