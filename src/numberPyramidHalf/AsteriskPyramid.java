package numberPyramidHalf;

import java.util.Scanner;

public class AsteriskPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        int rowNum = input.nextInt();
        for (int i = 1; i <= rowNum; i++) {
            for (int j = rowNum; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
