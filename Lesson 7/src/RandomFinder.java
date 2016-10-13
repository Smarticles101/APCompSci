import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Smarticles101 (Logan Stucki)
 *
 * This program finds Math.random() in a file
 * and outputs how many were found, and where they were found
 */

public class RandomFinder {
	public static void main(String args[]) {
		try {
			Scanner usrIn = new Scanner(System.in);
			System.out.print("Enter a file location to read :: ");
			final String READ_FILE = usrIn.nextLine();
			FileReader fileReader = new FileReader(READ_FILE);
            // Always wrap FileReader in BufferedReader.
            BufferedReader fileIn = new BufferedReader(fileReader);
            
            String in = null;
            while((in = fileIn.readLine()) != null) {
            	if(in.contains("Math.random()")) {
            		
            	}
            }
		} catch(FileNotFoundException e) {
			System.out.println("File not found :: \n" + e.getStackTrace());
		} catch(IOException e) {
			System.out.println("Error reading the file :: \n" + e.getStackTrace());
		}
	}
}