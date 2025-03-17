import java.util.Arrays;
public class longest_substring {
    public static int func(String s){
        int[] hash = new int[256]; // Default initialized to 0
        Arrays.fill(hash, -1);
        int l=0;
        int r=0;
        int maxlen=0;
        char[] str = s.toCharArray();
        int n=str.length;
        while(r<n) {
            if (hash[str[r]] != -1) {
                if (hash[str[r]] >= l) {
                    l = hash[str[r]] + 1;
                }
            }
            int len = r - l + 1;
            maxlen = Math.max(len, maxlen);
            hash[str[r]] = r;
            r++;
        }
        return maxlen;
}
    public static void main(String[] args) {
                String s= "cadbzabcd";
                int p=func(s);
                System.out.println(p);
    }
}
//longest substring with no repetetion