package comsampleproj;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the rows value :- ");
        int rows = sc.nextInt(); 

        for (int i = rows; i >= 0; i--) {
            for (int k = 0; k < i-rows +1; k++) {
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
