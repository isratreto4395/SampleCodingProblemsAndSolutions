package nestedForLoopExamples;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int count = 1;
        for (int i = 1; i <= 2 * num - 1; i++) {
            for (int j = count; j <= num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            if (i < num)
                count++;
            else
                count--;
            System.out.println("");
        }
    }
    }

