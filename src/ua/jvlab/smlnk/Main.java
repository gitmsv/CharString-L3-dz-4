package ua.jvlab.smlnk;

/*counting the number of the same character in a string.*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Input string:");

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // Get an array of characters from the string;
        char[] c = a.toCharArray();
        System.out.println("Array of characters: " + Arrays.toString(c));

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'b') {
                count++;
                System.out.println("In the drain " + count + " symbols 'b'.");
            }
                // System.out.println("No such symbol!");
        }
    }
}



