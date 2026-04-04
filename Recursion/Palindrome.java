
import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str,int i,int n){
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-i-1)) return false;
        return isPalindrome(str, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.next();
        int n=str.length();
        if(isPalindrome(str, 0, n)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
}
