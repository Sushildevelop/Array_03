package Practice.Array.Array_03;

import java.util.Scanner;

public class number_pairs_and_Sum {
    public static int pairSum(int a[],int x){
        int count=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Find the total number of pairs in the array whose sum is equal to the given value x.
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of array");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum pairs: ");
        int x=sc.nextInt();
        System.out.println(pairSum(arr,x));

    }
}
