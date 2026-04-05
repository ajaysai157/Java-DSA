
import java.util.Scanner;

public class Fibonacci {
    static int fib(int num){
        if(num<=1) return num;
        return fib(num-1)+fib(num-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fib(num);
        System.out.print("Fibonacci of "+num+" is "+result);
    }
}
