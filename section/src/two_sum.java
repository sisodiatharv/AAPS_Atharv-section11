import java.util.*;
public class two_sum {


    public static int[] twosum(int arr[],int target,int n){
        int i=0;

        int ans[]=new int[2];
        for (i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(i!=j){
                    if(arr[i]+arr[j]==target){
                        ans[0]=i;
                        ans[1]=j;
                        break;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target=sc.nextInt();
        System.out.println(twosum(arr,target,n));
    }
}
