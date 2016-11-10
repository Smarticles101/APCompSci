// Logan Stucki
// 10/11/16
// 6th period
// magpie 3

/**
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */

public class StringExplorer {

	public static void main(String args[]) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		int pos = sample.indexOf("slow");
		if(pos != -1)
		   System.out.println("slow is found at position " + pos);
		else
		   System.out.println("slow is not found");
		boolean search = true;
		pos=0;
		while(search) {
			pos = "Computer Science is the best, the greatest, and the most wonderful subject to study!".indexOf("the", pos);
			if(pos==-1)
				break;
			else
				System.out.println("The found at " + pos++);
		}

	}

}
