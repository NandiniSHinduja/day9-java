import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        System.out.println("Duplicate elements.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int counter=0;
            for( int j=0;j<a.length();j++){
                char ch2=a.charAt(j);
                if(ch==ch2){
                    counter++;
                }
            }
            if(counter>1){
                System.out.println("The character " +ch+ " is a duplicate character.");
            }
        }
        sc.close();
    }
    
}
