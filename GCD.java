import java.util.Scanner;

class Solution{
    public int GCDofTwoNumbers(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution sol=new Solution();
        System.out.println(sol.GCDofTwoNumbers(a, b));
        sc.close();
    }
}
