package Array.Array_Class_1;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter no. of element in an array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=GetSecondLargest(arr);
        System.err.println("Secondgreater element are :"+ans);

        sc.close();
    }
    public static int GetSecondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        return SecondLargest;
    }
}

// Another approach= 1) sort an array 
//                   2) n-1 is largest element 
//                   3) if duplicate largest present then traverse from last element till largest not eQual to
//                         another element   -- return element not eQual to largest ;
