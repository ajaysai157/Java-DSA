
import java.util.Scanner;

public class PrintNtimes{
    static void print(int i,int n){
        if(n==0) return;
        System.out.println(n);
        print(i+1,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Executing recursive function");
        print(1,n);
    }
}