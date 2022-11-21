import java.util.Scanner;

public class MaxMinValuesInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements in array");
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<=4;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<max)
            {
                max=arr[i];
            }
            if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum element is "+min);
        System.out.println("Minimum element is "+max);

    }
}