import java.util.*;
public class recursiveFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using recursive function.");
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("The factorial is: " +result);
        sc.close();
    }
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}
