import java.util.Scanner;


public class ReverseNumber {
    public static int ReverseOfNumber(int n){
        int rev=0,temp=n;
        while(temp>0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Reverse of number: "+ReverseOfNumber(n));
        sc.close();
    }
}
