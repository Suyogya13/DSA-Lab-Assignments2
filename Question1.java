public class Question1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.print("array-->  ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        //insertion at front

        System.out.println("array after addition");
        int val = 10;
        arr[0] = val;
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+  " ");
        }
        System.out.println();

        //deletion from front

        System.out.println("array after deletion");

        for(int i = 0;i<n-1;i++){
            arr[i] = arr[i+1];
            System.out.print(arr[i]+  " ");
        }




    }
}
