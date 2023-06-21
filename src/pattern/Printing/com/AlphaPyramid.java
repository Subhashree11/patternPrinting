package pattern.Printing.com;

public class AlphaPyramid {

    public static void main(String[] args) {
        int rows = 6; // Number of rows in the pyramid
        int currentChar = 65; // ASCII value of 'A'

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces for pyramid shape
            }

            for (int k = 1; k <= i; k++) {
                char alphabet = (char) currentChar;
                System.out.print(alphabet + " "); // Print alphabets
                currentChar++;
            }

            System.out.println();
        }
    }
}



