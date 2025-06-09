package Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {3,5,0,4,0};
        // Solution.result(arr);
        
        // Good approach to solve this problem
        int key =0 ;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0 ) {
                arr[key] = arr[i];
                key++;
            }
        }
        while(key<arr.length){
            arr[key]=0;
            key++;
        }
        // printing Array
        for(int value : arr){
            System.out.print(value+" ");
        }

    }
}
 
 class  Solution {
    public static void result(int []arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j=i; j<arr.length-1; j++){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
