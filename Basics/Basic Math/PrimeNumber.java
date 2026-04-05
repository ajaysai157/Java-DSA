import java.util.*;
public class PrimeNumber{
    static List<Integer> primeInRange(int n,int m){
        List<Integer> result=new ArrayList<>();
        for(int i=n;i<m;i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }
    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> arr=primeInRange(n, m);
        for(int num:arr){
           System.out.print(num+" ");
        }        
        sc.close();
    }
}