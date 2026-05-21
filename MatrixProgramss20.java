import java.util.*;
public class  MatrixProgramss20{
public static void main(String args[] ){
        int rows = 7;
        int cols = 13;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= cols; j++) {

                if(j == 1 || j == cols || j == 2*i-1 || j == cols-(2*i-2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

}
}