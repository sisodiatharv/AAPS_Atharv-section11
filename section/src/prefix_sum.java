import java.sql.SQLOutput;
import java.util.*;

public class prefix_sum {
//    public static int[]  func(int[] arr){
//        int n=arr.length;
//        int[]prefix=  new int[arr.length];
//        prefix[0]=arr[0];
//        for(int i=1;i<n;i++){
//            prefix[i]=prefix[i-1]+arr[i];
//        }
//        return prefix ;
//    }
//    public static int range_sum(int[]arr){
//        Scanner sc=new Scanner(System.in);
//        int L=sc.nextInt();
//        int R=sc.nextInt();
//        int sum=0;
//        while(L<=R){
//            sum=sum+arr[L];
//            L++;
//        }
//        return sum;
//    }
    public static void Equilibrium(int[] arr){
        int L=0;
        int R=arr.length-1;
        int lsum=0;
        int rsum=0;
        int i=1;
        while(i<R){

            lsum=lsum+arr[L];
            rsum=rsum+arr[R];
            if(lsum==rsum){
                System.out.println(i);
            }
            i++;
            L++;
            R--;

        }

    }

    public static void main(String[] args) {


        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        Equilibrium(arr);
//        System.out.println(Arrays.toString(func(arr)));
    }
}
