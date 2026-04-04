import java.util.Scanner;

public class CountDigits {
    public static int CountOfDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Count of digits : "+CountOfDigits(n));
    }
}
