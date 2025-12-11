public class Question4 {
    public static void main(String[] args) {

        int[] arr = {5,4,3,7,8,7};

        int max = 0;
        int min = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
