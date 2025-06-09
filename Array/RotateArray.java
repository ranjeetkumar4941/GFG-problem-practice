package Array;
public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {5,3,4,9,6,6};
        int n = 12;
        // int key = 0;
        // while(key<n){
        //     int temp = arr[key];
        //     for(int i=0; i<arr.length; i++){
        //         arr[i]=arr[i+1];
        //     }
        //     arr[rr.length-1]=temp;
        //     key++;
        // }

        int[] temp = new int[n];
        n=n%arr.length;
        System.out.println(n);
        for(int i=0; i<n; i++){
            temp[i]=arr[i];
        }
        for(int i=0; i<(arr.length-n); i++){
            arr[i]=arr[i+n];
        }
        for(int i=arr.length-n; i<arr.length; i++){
            arr[i]=temp[i+n-arr.length];
        }
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}
