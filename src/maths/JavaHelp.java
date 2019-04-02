// @author ChibuezePaul
package maths;

import java.util.Scanner;

public class JavaHelp {

    public void jHelp() {

        Scanner hlp = new Scanner(System.in);

        System.out.println("\n\nHelp on Java Control Statements");
        System.out.println(
                "\t1.If Else Statement \n\t2.If Else if Statement \n\t3.Switch Case Statement \n\t4.For Loop Statements \n\t5.While Loop Statement \n\t6.Do While Loop Statement\n");
        System.out.print("Select a number to get the needed help: ");

        String a = hlp.next();
        // while(/0){
        switch (a) {
            case "1":
                ifElseHelp();
                break;
            case "2":
                ifElseIfHelp();
                break;
            case "3":
                switchHelp();
                break;
            case "4":
                forLoopHelp();
                break;
            case "5":
                whileLoopHelp();
                break;
            case "6":
                doWhileLoopHelp();
                break;
            default:
                System.out.println("\nSorry! No such option");
                System.out.println("Input a valid option next time!");
                break;
        }
        // }
    }

    static void ifElseHelp() {
        System.out.println("\n  if(condition){\n\tstatements;\n  }\n\n  else{\n\tstatements;\n  }");
    }

    static void ifElseIfHelp() {
        System.out.println(
                "\n  if(condition){\n\tstatements;\n  }\n\n  else if{\n\tstatements;\n  }\n\n  else{\n\tstatements;\n  }");
    }

    static void switchHelp() {
        System.out.println("\n  switch(expression) {\n\tcase value1:\n\tstatement1;\n\tbreak;\n");
        System.out.println("\tcase value2:\n\tstatement2;\n\tbreak;\n");
        System.out.println("\tcase valueN:\n\tstatementN;\n\tbreak;\n");
        System.out.println("\tdefault:\n\tstatement2;\n\tbreak;\n  }");
    }

    static void forLoopHelp() {
        System.out.println("\n  for(declaration; condition; iteration) {\n\n\tbody of loop;\n  }");
    }

    static void whileLoopHelp() {
        System.out.println("\n  while(condition) {\n\n\tbody of loop;\n  }");
    }

    static void doWhileLoopHelp() {
        System.out.println("\n  do { \n\tbody of loop; \n\n  } while(condition)");
    }
}
