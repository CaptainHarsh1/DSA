package Array.Array_Class_1;
import java.util.Scanner;


public class greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter no. of element in an array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=Greater(arr);
        System.err.println("greater element are :"+ans);

        sc.close();
    }

    public static int Greater(int arr[]){
        int n=arr.length;
        int greatest=arr[0];
        for (int i = 1; i < n; i++) {
           if(greatest<arr[i]){
            greatest=arr[i];
           }
            
        }
        return greatest;
    }
}
