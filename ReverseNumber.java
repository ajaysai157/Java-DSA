import java.util.Scanner;

class Reverse{
    public int ReverseOfNumber(int n){
        int rev=0,temp=n;
        while(temp>0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        return rev;
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        Reverse sol=new Reverse();
        System.out.println("Reverse of number: "+sol.ReverseOfNumber(n));
        sc.close();
    }
}
