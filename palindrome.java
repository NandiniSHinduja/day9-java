import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        System.out.println("Palindrome.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int counter=0;
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            String s=String.valueOf(ch);
            int r=a.length()-(i+1);
            char ch1=a.charAt(r);
            String s1=String.valueOf(ch1);
            if(s.equals(s1)){
                counter++;
            }
        }
        if(counter==a.length()){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
        sc.close();
    }
}