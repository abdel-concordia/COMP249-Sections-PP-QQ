package comp249_pp_qq;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner myScanner = null;
        try {
            myScanner = new Scanner(new FileInputStream("Amal.txt"));

        } catch (FileNotFoundException fnfe) {
            System.exit(0);
        }

        String s = null;

        while (myScanner.hasNextLine()) {
            s = myScanner.nextLine();
            System.out.println(s);
        }


        /*
        // Open the file
        PrintWriter myWriter = null;
        try {
            myWriter = new PrintWriter(new FileOutputStream("file.txt", true));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open the file.");
            System.exit(0);
        }
        // Write to the file
        myWriter.println("Good evening.");
        myWriter.print(120);
        // Close the file
        myWriter.close();

         */
    }

}
