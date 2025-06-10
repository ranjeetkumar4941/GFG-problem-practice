package Array;
import java.util.*;
class MajorityElement {
    public static void main(String[] args) {
        int [] arr={1,4,2,4,3,4,5};
        System.out.println(returnElement(arr));
    }
    public static List<Integer> returnElement(int []nums){
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        for(int v : nums){
            System.out.print(v);
        }
        int key = 1;
        for(int  i=0; i<nums.length-1; i++){
            
            // for(int j=i+1; j<nums.length; j++){
            //     if(nums[i] == nums[j]){
            //         key++;
            //     }
            // }
            // if(key>nums.length/3 && !li.contains(nums[i])){
            //     li.add(nums[i]);
            // }

            if(nums[i]==nums[i+1]){
                key++;
                if(key>nums.length/3 && !li.contains(nums[i])){
                    li.add(nums[i]);
                }
            }else{
                key=1;
            }

        }
        return li;
    }
    
}