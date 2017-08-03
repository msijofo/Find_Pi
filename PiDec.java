package pidec;

import java.util.Scanner;
import java.math.BigDecimal;

public class PiDec {
    //Find PI to the Nth Digit
    //Enter a number and have the program generate PI up to that many decimal places.
    //Keep a limit to how far the program will go.

    public static void main(String[] args) {

        BigDecimal seven = new BigDecimal(7.0);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the decimal places to which you'd like PI printed: ");
        int i = input.nextInt();
        BigDecimal pi = new BigDecimal(22.0).divide(seven, i, BigDecimal.ROUND_UP);

        if (i > 100 || i < 0) {
            System.out.println("Decimal place out of bounds!");
        } else {
            System.out.println(pi);
        }
    }
}
