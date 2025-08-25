package Array.Array_Class_1;

import java.util.Scanner;

public class LinearSearch {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter no. of element in an array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.err.println("Element you want to search");
        int key =sc.nextInt();
        int ans=GetElement(arr,key);
        System.err.println(" element at  :"+ans+ "  position");

        sc.close();
    }

    public static int  GetElement(int arr[], int key){
        int n= arr.length;
       // int position;
        for (int i = 0; i < n; i++) {
            if(key==arr[i]){
                return i;
            }
            
        }
        //return position;
        return -1;
    }
}
