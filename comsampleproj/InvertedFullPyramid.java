package comsampleproj;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

