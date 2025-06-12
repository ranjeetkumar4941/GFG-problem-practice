package Array;

public class AverageofElements {
    public static void main(String[] args) {
        int [] arr= {1,62,7,5};
        System.out.println(average(arr));
    }
    public static String average(int []arr){
        float temp = 0;
        for(int i=0; i<arr.length; i++){
            temp += arr[i];
        }
        float avg = temp/arr.length;
        System.out.println(temp/arr.length);
        String result = String.format("%.2f", avg);
        
        return result;
    }
}
