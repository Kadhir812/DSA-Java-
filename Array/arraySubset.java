import java.util.Arrays;
import java.util.HashSet;
public class arraySubset {
    public static boolean isSubset(int[]a, int[]b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i =0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] == b[j]){
                i++;
                j++;
            }else{
                return false;
            }
        }

        return j == b.length;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4};

        System.out.println(isSubset(a, b)); // true
    }
}
