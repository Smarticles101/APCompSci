import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class lol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lol {
    public static void main(String args[]) {
        try {
        File lol = new File("lol.txt");
	    if (lol.createNewFile()){
	        System.out.println("File is created!");
	    }else{
	        System.out.println("File already exists.");
	    }
	    PrintWriter writer = new PrintWriter(lol,"utf-8");
	    for(int x = 1; x<=1000000000; x++) {
            for(int y = 1; y<=50; y++) {
                writer.print("LO");
            }
            writer.print("L\n");
        }
        writer.close();
	   } catch (IOException e) {
	       e.printStackTrace();
	   }
    }
}