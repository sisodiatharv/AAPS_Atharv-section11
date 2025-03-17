public class longest_subarray {
    public static void main(String[] args) {
        int arr[]={7,2,3,4,5,6,8};
        int k=6;
        int l=0;
        int r=0;
        int sum=0;
        int maxlen=0;
        int n=arr.length;
        while(r<n)
        {
            sum=sum+arr[r];
            if(sum>k){
                sum=sum-arr[l];
                l=l+1;
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r=r+1;
        }

        System.out.print(maxlen);
    }
    //time complexity is O(n +n) space complexity O(1)



}
