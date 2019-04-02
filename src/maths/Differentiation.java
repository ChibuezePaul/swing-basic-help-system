// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class Differentiation {

    public void differentiation() {

        Scanner input = new Scanner(System.in);

        int x, y, a, n, b, c;

        System.out.println("\n\nUSING GENERAL RULE [ax^n = nax^(n-1)]");
        System.out.println("where: a = x variable; n = power of x.\n");
        System.out.print("input the number of x present in the equation: ");

        x = input.nextInt();

        for (y = 0; y < x; y++) {

            System.out.print("\nInput the value of a: ");
            a = input.nextInt();
            // System.out.println();

            System.out.print("Input the value of n: ");
            n = input.nextInt();
            System.out.println();

            b = n * a;
            c = n - 1;
            System.out.print(a + "x^" + n + " = ");
            System.out.println(b + "x^" + c + " + 0");
            System.out.println();
        }
    }
}
