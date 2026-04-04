
import java.util.Scanner;

public class PalindromeNumber {
    public static boolean PalindromeOfNumber(int n){
        int rev=0,temp=n;
        while(temp>0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        return rev==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(PalindromeOfNumber(n)){
            System.out.println(n+" is Palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }
        sc.close();
    }
}
