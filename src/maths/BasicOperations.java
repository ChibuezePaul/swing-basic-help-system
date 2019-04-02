// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class BasicOperations {

    public void basicMath() {

        int c;
        Scanner input1 = new Scanner(System.in);

        System.out.println("\n\nBasic Calculations");
        System.out.println(
                "\t1.Addition\n \t2.Subtraction\n \t3.Multiplication\n \t4.Division\n \t5.Modulo\n6.Exit Calculator\n");
        System.out.print("Select an option: ");
        c = input1.nextInt();
        System.out.print("\n");

        if (c == 1) {
            add();
        } else if (c == 2) {
            sub();
        } else if (c == 3) {
            mult();
        } else if (c == 4) {
            div();
        } else if (c == 5) {
            mod();
        } else if (c == 6) {
            System.out.println("\nBye!");
        } else {
            System.out.println("\nSorry! No such option");
            System.out.println("Input a valid option next time!");
        }
    }

    double a, b;
    Scanner input = new Scanner(System.in);

    void add() {

        System.out.print("Input your first value: ");
        a = input.nextDouble();

        System.out.print("Input your second value: ");
        b = input.nextDouble();
        System.out.println("\nThe sum of the given values is " + (a + b));
    }

    void sub() {

        System.out.print("Input your first value: ");
        a = input.nextDouble();
        System.out.print("Input your second value: ");
        b = input.nextDouble();
        System.out.print("\nThe difference of the given values is " + (a - b));
    }

    void div() {

        System.out.print("Input your first value: ");
        a = input.nextDouble();

        System.out.print("Input your second value: ");
        b = input.nextDouble();
        System.out.println("\nThe quotient of the given values is " + (a / b));
    }

    void mult() {

        System.out.print("Input your first value: ");
        a = input.nextDouble();

        System.out.print("Input your second value: ");
        b = input.nextDouble();
        System.out.println("\nThe multiple of the given values is " + (a * b));
    }

    void mod() {

        System.out.print("Input your first value: ");
        a = input.nextDouble();

        System.out.print("Input your second value: ");
        b = input.nextDouble();
        System.out.println("\nThe modulo of the given values is " + (a % b));
    }
}
