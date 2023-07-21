import java.util.*;
public class Palindrome{
    public static boolean pal ( String S,int start,int end){
        if (start>end) return true;

            if (start != end) {
                return false;
            }
            return pal(S, start+1, end-1);}

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            String S = sc.next();

            int start=S.charAt(0);

            int n=S.length();
            int end=S.charAt(n-1);
            System.out.println(Palindrome.pal(S,start,end));

            }

    }
