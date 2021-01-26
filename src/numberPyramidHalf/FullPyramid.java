package numberPyramidHalf;

public class FullPyramid {
    public static void main(String[] args) {



        for(int i=1;i<=20; i++){
            for(int j = 20; j>=i; j--){
                System.out.print(" ");
            }

            for(int k = 1; k<=i; k++){
                System.out.print(" $ ");
            }System.out.println();
        }



    }
}
