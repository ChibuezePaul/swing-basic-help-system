// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class MultTable2 {

    public void multTable() {
        Scanner input = new Scanner(System.in);

        System.out.println("\t=== Multiplication Table Try-out === \n");

        System.out.print("Please input a number to get its 1 - 15 multiples : ");
        int a = input.nextInt();

        for (int z = 1; z <= 15; z++) {
            System.out.println("\n" + a + " × " + z + " = " + a * z + "\n");
        }
    }
}
