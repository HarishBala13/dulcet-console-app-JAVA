package comsampleproj;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the rows value :- ");
        int rows = sc.nextInt(); 

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

