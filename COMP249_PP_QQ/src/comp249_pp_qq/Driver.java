package comp249_pp_qq;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        int y = 0;

        try {
            System.out.print("Please input a number: ");
            int x = sc.nextInt(); // InputMismatch

            calculate(x); // Division by Zero

        } catch (Exception ime) {
            System.out.println("There was an unknown error.");
        } finally {
            System.out.println("This is finally block.");
        }

        System.out.print("The result is: ");
        System.out.println(y);

    }

    public static int calculate(int number) throws ArithmeticException {

        int y = 3 / (number - 5); // Division by Zero

        return y;
    }

}
