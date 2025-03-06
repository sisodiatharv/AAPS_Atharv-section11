import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(int number){
        int l=number;
        int r=0;

        if (number<=0){
            return false;
        }
        while(l>0){
            int digit=l%10;
            r=r*10+digit ;
            l=l/10;

        }

        return number==r;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
       if(ispalindrome(number)){
           System.out.println(number+" is a palindrome");
       }
       else {
           System.out.println(number+" not a palindrome");
       }

    }
}
