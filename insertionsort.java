import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int temp;
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            temp=A[i];
            for(int j=i-1;j>=0;j--){
                if(A[j]>temp){
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("The sorted elements are:");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        sc.close();
    }
}
