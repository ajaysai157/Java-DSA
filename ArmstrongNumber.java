import java.util.Scanner;

class Armstrong{
    boolean isArmstrongNumber(int num){
        if(num==0) return true;
        int original=num,n=0,result=0;
        while(original>0){
            n++;
            original/=10;
        }
        original=num;
        while(original>0){
            int rem=original%10;
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= rem;
            }
            result += power;
            original/=10;
        }
        return result==num;
    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Armstrong sol=new Armstrong();
        if(sol.isArmstrongNumber(num)){
            System.out.println(num+" is a armstrong number");
        }else{
            System.out.println(num+" is not an armstrong number");
        }
        sc.close();
    }
}
