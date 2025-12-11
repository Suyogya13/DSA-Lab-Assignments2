import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {4, 6, 7},
                {8, 8, 9},
                {70, 7, 13}
        };
        System.out.println("enter the target element");
        int target = sc.nextInt();
        boolean found = false;

        // Linear search in 2D matrix ---->>>>
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found in matrix.");
        }
    }
}
