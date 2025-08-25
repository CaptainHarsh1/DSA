package Array.Array_Class_1;

public class LeftRotatekEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        GetleftRotate(arr, 3);
        for(int i : arr){
            System.err.print(i+" ");
        }      
    }
    public static void GetleftRotate(int arr[], int k){
      int  n=arr.length;
         k=k%n;
        Reverse(arr,0,k-1);
        Reverse(arr,k, n-1);
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int arr[],int start,int end){
         while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
         }
    }
}
