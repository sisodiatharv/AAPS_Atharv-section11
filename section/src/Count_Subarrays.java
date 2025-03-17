public class Count_Subarrays {
    public static int func(int arr[],int k){

        int l=0;
        int r=0;
        int sum=0;
        int m=0;
        int n=arr.length;
        while(r<arr.length){
            sum+=arr[r];
            if(sum>k){
                sum-=arr[l];
                l=l+1;
            }
            if(sum==k){
                m++;
            }
            r++;
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4};
        int k=2;

        System.out.println(func(arr,k));
    }
}
