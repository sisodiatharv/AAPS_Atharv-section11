import java.util.*;
public class max_point {
    public static  int cards(int[]nums, int k){
        int n= nums.length;
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        for (int i=0;i<=k-1;i++){
            lsum=lsum+nums[i];
        }
        int rindex=n-1;
        for (int i=k-1;i>=0;i--){
            lsum=lsum-nums[i];
            rsum=rsum+nums[rindex];
            rindex=rindex-1;

            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        int []nums={6,2,3,4,7,2,1,7,1};
        int p=cards(nums,k);
        System.out.println(p);
    }

}
