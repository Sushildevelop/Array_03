package Practice.Array.Array_03;

import java.util.Scanner;

public class Repeating_value {

    public static int fristReapeated(int arr[]){
        int n=arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            int curr=arr[i];
            for (int j=i+1;j<n;j++){
                if (arr[j]==curr){
                return i+1;
                }

            }
        }
        return -1;
    }











    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of array: ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(fristReapeated(arr));
    }
}
