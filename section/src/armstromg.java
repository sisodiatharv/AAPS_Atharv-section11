public class armstromg {
    public static boolean isarmstrong(int x){
        int s=x;
        int sum=0;
        while(s>0){
            int a=s%10;
            a=a*a*a;
            sum=sum+a;
            s=s/10;
        }
        return sum==x;
    }
    public static void main(String[] args) {
        int x=153;
        if(isarmstrong(x)){
            System.out.println("yes");
        }
        else
            System.out.println("not");
    }
}
