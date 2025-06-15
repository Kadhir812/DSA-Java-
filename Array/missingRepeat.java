public class missingRepeat {
    static int[] findRepeatAndMissing(int arr[]){
        long n = arr.length;

        long SN = (n * (n + 1))/2;
        long S2N = (n * (n + 1) * (2 * n + 1))/6;

        long S = 0,S2 = 0;
        for(int i =0;i <n;i++){
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;
        long val3 = val2 / val1;
         long x = (val1 + val3) / 2;
         long y = x - val1;
         return new int[]{(int)x, (int)y};




    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 1 };
        int[] res = findRepeatAndMissing(arr);
        System.out.println("Repeating: " + res[0] + ", Missing: " + res[1]);
    }
}


//missing number 
// import java.util.*;

// public class GfG {
//     public static int missingNum(int[] arr) {
//         long n = arr.length + 1;

//         // Calculate the sum of array elements
//         long sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         // Use long for expected sum to avoid overflow
//         long expSum = n * (n + 1) / 2;

//         // Return the missing number
//         return (int) (expSum - sum);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
//         System.out.println(missingNum(arr));
//     }
// }