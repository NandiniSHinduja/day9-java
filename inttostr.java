import java.util.*;
public class inttostr{
    public static void main(String[] args) {
        System.out.println("Integer to String");
        System.out.println("Enter an integer:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=String.valueOf(a);
        System.out.println("The converted string is " +b);
        sc.close();
    }
}