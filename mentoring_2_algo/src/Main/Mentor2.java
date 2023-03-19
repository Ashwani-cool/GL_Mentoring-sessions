package Main;

import rotate.Rotation;
import searching.Search;
import sorting.MergeSort;

import java.util.Scanner;

public class Mentor2 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        MergeSort ms = new MergeSort();
        ms.msort(arr,0,n-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        Rotation rt = new Rotation();
        int[] rotated_arr = rt.leftRotateByMid(arr,n);
        System.out.println("Rotated array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(rotated_arr[i]);
            System.out.print(" ");
        }
        System.out.println();
//        Find and element--
        System.out.println("Enter the element to search in array: ");
        Search srch = new Search();
        int x= sc.nextInt();
        if (x > rotated_arr[n-1])
            System.out.println(srch.binarySearch(rotated_arr,0,n/2,x));
        else
            System.out.println(srch.binarySearch(rotated_arr,n/2 + 1,n-1,x));
    }
}
