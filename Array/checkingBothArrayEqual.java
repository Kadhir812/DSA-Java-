import java.util.HashMap;
import java.util.Map;

public class checkingBothArrayEqual {
    public static boolean checkArraysEqual(int[] a, int[] b){
        int m = a.length;
        int n = b.length;

        if(m != n){
            return false;
        }

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i <n;i++){
            if(map.get(a[i]) == null)
                map.put(a[i],1);
                else{
                    count = map.get(a[i]);
                    count++;
                    map.put(a[i], count);
                }
        }

        for(int i =0;i < n;i++){
            if(map.get(b[i]) == null)
                return false;
            if(map.get(b[i]) == 0){
                return false;
            }else{
                count = map.get(b[i]);
                --count;
                map.put(b[i],count);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 7, 2, 1};

        System.out.println(checkArraysEqual(a, b)); // true
    }
}
