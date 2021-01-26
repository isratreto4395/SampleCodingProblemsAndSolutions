package numberPyramidHalf;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                for (int l = 1; l <= k; l++) {
                    //System.out.print(" ");
                }
                for (int m = 1; m <= i; m++) {
                    for (int n = 1; n <= m; n++)
                        System.out.print(" V ");

                }
                System.out.println();
            }
        }
    }
}
