import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort.");
        System.out.println("Enter the number of elements required.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++){
                if(A[i]>A[i+1]){
                    int temp=A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                }
            }
        }
        System.out.println("The sorted order is:");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        sc.close();
    }
}
