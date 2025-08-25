package Array.Array_Class_1;

public class MaxconsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,0,0,1,1,1};
        int result=getConsecutiveOnes(arr);
        System.err.println("maximum consecutive ones are: " +result);
    }

    public static int getConsecutiveOnes(int arr[]){
        int maxi=0;
        int cnt=0;
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            if(arr[i]==1){
                cnt++; 
                maxi=Math.max(cnt,maxi);           // u can also use Maximum function here to check which is maximum (cnt, maxi)
            }
            else {
                maxi=Math.max(cnt,maxi);
                cnt=0;
            }
              // for last check how many ones are coming ;
        }
        return maxi;
    }
}
