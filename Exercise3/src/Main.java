import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{
    public static void main(String [] args) throws FileNotFoundException{
        // Kalder metoden wordCounter
        System.out.println("Ord i filen: " + wordCounter());
    }
    public static int wordCounter() throws FileNotFoundException{
       //Opretter en fil med dataen fra Testfil laver en Scanner objekt og definere en int
        File test = new File("Exercise3/src/Testfil");
        Scanner sc = new Scanner(test);
        int wordCount = 0;
        // Et while loop som kører indtil der ikke er flere ord i filen
        while (sc.hasNextLine()) {
            String word = sc.next();
            wordCount++;
            }
            return wordCount;
    }

    }

