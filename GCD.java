import java.util.Scanner;

public class GCD {
    public static int GCDofTwoNumbers(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+GCDofTwoNumbers(a, b));
        sc.close();
    }
}
