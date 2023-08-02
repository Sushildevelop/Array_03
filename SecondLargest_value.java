package Practice.Array.Array_03;

import java.util.Scanner;

public class SecondLargest_value {

    public static int secondLargestvalue(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }

        }
        for (int i=0;i<n;i++){
            if (arr[i]!=max){
                if (arr[i]>smax){
                    smax=arr[i];
                }
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of arrays: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondLargestvalue(arr));
    }
}
