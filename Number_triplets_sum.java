package Practice.Array.Array_03;

import java.util.Scanner;

public class Number_triplets_sum {
    public static int findTriplet(int arr[],int x){
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k< arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;




    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of triple : ");
        int x=sc.nextInt();
        System.out.println(findTriplet(arr,x));

    }
}
