import java.util.Scanner;
public class Question5 {
    // factorial using iteration
    public static long factorial(int n){
        int fact =1;
        for(int i = 1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    //factorial using recurssion
    public static  int factorialRecursive(int n){
        if(n==0||n==1)

        {
            return 1;
        }
        return n*factorialRecursive(n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        System.out.println("fatorial using iteration  "   +factorial(num));
        System.out.println("factorial using recursion  "   +factorialRecursive(num));
    }
}
