import java.util.Scanner;

public class palindrome_string {
    public static boolean ispalindrome(String c){
        int l=c.length();
        for (int i=0;i<l;i++){
            if(c.charAt(i)!=c.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string:");
        String c=sc.next();
        if(ispalindrome(c)){
            System.out.println(c+" is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
