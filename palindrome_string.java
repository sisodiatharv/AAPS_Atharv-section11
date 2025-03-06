import java.util.Scanner;

public class palindrome_string {
    public static boolean ispalindrome(String c){
        int j=c.length();
        int i=0;
       while(i<j){
            if(c.charAt(i)!=c.charAt(j-1)){
                return false;
            }
            j--;
            i++;
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
