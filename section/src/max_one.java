//import java.util.*;
//public class max_one {
//    public static int func(int arr[],int k){
//        int n=arr.length;
//        int maxlen=0;
//        for(int i=0;i<n;i++)
//        {
//            int zeros=0;
//            for (int j=i;j<n;j++)
//            {
//                if(arr[j]==0)
//                {
//                    zeros++;
//                }
//                if(zeros<=k)
//                {
//                    int len =j-i+1;
//                    maxlen=Math.max(maxlen,len);
//                }
//                else
//                {
//                    break;
//                }
//            }
//        }
//        return maxlen;
//    }
//    public static void main(String[] args) {
//        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
//        Scanner sc=new Scanner(System.in);
//        int k=2;
//
//        System.out.println(func(arr[],k));
//
//    }
//}
