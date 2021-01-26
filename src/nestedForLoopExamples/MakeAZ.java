package nestedForLoopExamples;

public class MakeAZ {
    public static void main(String[] args) {
        int val = 8;

        //creates top bar
        for(int i = 1; i<val; i++){
            System.out.print("* ");
        }
        System.out.println("*");

        //Loops down the page with next lines

        for(int j = 1; j< val-1; j++){
           //this loop create spaces
            for(int k = 0; k<val-j-1;k++){
                System.out.print("  ");
            }
            System.out.println("*");
        }

        for(int i = 1; i<val; i++){
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
