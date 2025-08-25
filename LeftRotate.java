package Array.Array_Class_1;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        RotateArray(arr);
        for(int i : arr){
            System.err.print(i+" ");
        }
    }
    public static void RotateArray(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}
