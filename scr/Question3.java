public class Question3 {
    public static void printmatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6}
        };
        int b[][] = {{8,7,6},{9,2,3}};
        int add[][] = new int[a.length][a[0].length];
        for(int i= 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                add[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("addition");
        printmatrix(add);
        int c[][] ={{4,2,3},{5,8,3},{6,4,5}};
        int rowsA = a.length;
        int colA = a[0].length;
        int colC = c[0].length;
        int mul[][] = new int[rowsA][colC];
        for(int i = 0;i<rowsA;i++){
            for(int j = 0;j<colC;j++){
                mul[i][j] = 0;
                for(int k =0 ;k<colA;k++){
                    mul[i][j] = a[i][k]*c[k][j];

                }
            }
        }
        System.out.println("multiplication of matrices");
        printmatrix(mul);
    }
}
