import java.util.Scanner;

class Count{
    public int CountOfDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        Count sol=new Count();
        System.out.println("Count of digits : "+sol.CountOfDigits(n));
    }
}
