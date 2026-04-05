
import java.util.Scanner;

public class NumberFrequency{
    static int Frequency(int[] arr,int num){
        int[] freq=new int[1000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq[num];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements into an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to check it's frequency ");
        int num=sc.nextInt();
        System.out.println("frequency of element is: "+Frequency(arr, num));
    }
}