// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class MainApp {

    int a;

    static MainApp b = new MainApp();

    public void firstCall() {

        BasicOperations tr = new BasicOperations();
        QuadraticEquation qe = new QuadraticEquation();
        Differentiation diff = new Differentiation();
        JavaHelp jh = new JavaHelp();
        MultTable2 mt = new MultTable2();

        System.out.println("\n\nSTUDENT COMPANION\n");
        System.out.println(
                "\t1.Basic Maths\n\t2.Quadratic Equation\n\t3.Differentiation\n\t4.Help On Java\n\t5.Multuplication Table\n");
        System.out.print("Select an option or press 0 to exit: ");
        try {
            Scanner opt = new Scanner(System.in);
            a = opt.nextInt();

            switch (a) {
                case 1:
                    tr.basicMath();
                    break;
                case 2:
                    qe.quadratic();
                    break;
                case 3:
                    diff.differentiation();
                    break;
                case 4:
                    jh.jHelp();
                    break;
                case 5:
                    mt.multTable();
                    break;
                case 0:
                    System.out.print("Blast Off !!\n\n");
                    break;
                default:
                    System.out.println("\nSorry! No such option");
                    System.out.println("Input a valid option next time!\n\n");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Not a valid input");
        }

    }

    public void secondCall() {

        b.firstCall();
    }

    public static void main(String[] args) {
        do {
            b.firstCall();
        } while (b.a != 0);

    }
}
