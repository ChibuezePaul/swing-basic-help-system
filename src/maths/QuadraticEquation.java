// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class QuadraticEquation {

    public void quadratic() {

        // declare all variables
        double a, b, c, w, x, y, z, ans1, ans2;

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nQuadratic Equation Solving Tool");
        System.out.println();

        System.out.print("\tInput the value of a: ");
        a = input.nextInt();
        System.out.println();

        System.out.print("\tInput the value of b: ");
        b = input.nextInt();
        System.out.println();

        System.out.print("\tInput the value of c: ");
        c = input.nextInt();
        System.out.println();

        w = (-b) / (2 * a);
        x = (b * b) - (4 * a * c);
        y = Math.sqrt(x);
        z = y / (2 * a);
        ans1 = w + z;
        ans2 = w - z;

        System.out.print("\tThe values of x are " + ans1 + ", " + ans2);
        System.out.println();
    }
}
