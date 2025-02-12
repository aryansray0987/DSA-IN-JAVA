package PatternPrinting;

public class pro2 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the inverted pyramid
        printInvertedPyramid(rows);
    }

    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*" + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}



