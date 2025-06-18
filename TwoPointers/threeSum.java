package TwoPointers;

import java.util.Arrays;

public class threeSum {
    static boolean threeSum(int [] arr,int target){
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0;i < n - 2;i++){

            int l = i + 1;
            int r = n - 1;

            int requiredSum = target - arr[i];
            while(l < r){
                int sum = arr[l] + arr[r];
                if(sum == requiredSum){
                    return true;
                }else if(sum < requiredSum){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
        
    }


    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (threeSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

