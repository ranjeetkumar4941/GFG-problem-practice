package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for(int value : arr){
            if(max<value){
                secondMax = max;
                max = value;
                if (secondMax<value && max!=value) {
                    secondMax = value;
                }
            }
            
        }
        System.out.println(secondMax);
        System.out.println(max);
        sc.close();
    }
}
