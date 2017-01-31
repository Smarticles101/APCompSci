import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FancyWordsRunner {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(new File("fancywords.dat")));
            int c = in.nextInt();
            in.nextLine();

            for(int i = 0; i<c; i++) {

                String[] bleh = in.nextLine().split(" ");
            }

        } catch(FileNotFoundException e) {
            System.out.println("FANCYWORDS.DAT TWAS NOT FOUND. DID YOU DELETE IT!?");
            System.out.println(e.getStackTrace());
        }
    }
}