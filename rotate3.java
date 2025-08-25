
package Array.Array_Class_1;
public class rotate3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int newarr[]=new int[arr.length];
        GetleftRotate(3,arr,newarr);
        for(int i : newarr){
           System.err.print(i);
        }     
    }
  public static void   GetleftRotate(int k,int arr[],int newarr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
       int j=(k+i)%n;          
       newarr[j]=arr[i];
      } 
  }
}
