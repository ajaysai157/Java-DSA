
import java.util.Scanner;

public class ReverseArray {
    static void reversingArray(int[] arr,int i,int n){
        if(i>=n/2) return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        reversingArray(arr, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reversingArray(arr, 0, n);
        System.out.println("Array after reversing");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
