package sorting;
import java.util.Arrays;

public class twoSum {
    static boolean twoSums(int[] arr,int target){

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;

            }else if(sum < target){
                left++;

            }else{
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        boolean result = twoSums(arr, target);
        System.out.println("Two numbers that sum to " + target + ": " + result);
    }
}
