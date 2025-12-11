public class Question2 {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7};
        int n  = arr.length;
        System.out.println("initial array");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("reverse of the array");
        for(int i =n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");

        }
    }
}
