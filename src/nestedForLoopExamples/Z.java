package nestedForLoopExamples;

import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        int val;
        Scanner scan = new Scanner(System.in);
        System.out.println("How big do you want Z to be?");
        val=scan.nextInt();

        for (int i = 0; i <= val; i++) {
            System.out.print("* ");}

        System.out.println("* ");

        for (int i = 1; i <= val; i++) {

            for (int k = val; k >= i; k--) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= val; i++) {
            System.out.print("* ");
        }
        System.out.print("* ");
        System.out.println("");

    scan.close();
    }
    }

