package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] arr={2,2,3,2,5};
        
        
        List<Integer> li= new ArrayList<>();
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if (arr[i] == arr[j]) {
        //             li.add(arr[i]);
        //             break;
        //         }
        //     }
        // }

        // good time complexity
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                li.add(arr[i]);
                i++;
            }
        }
        System.out.println(li);
    }
}
