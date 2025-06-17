package hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class frequencyCount {
    public List<Integer> frequencyCount(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= 1; i++){
            result.add(map.getOrDefault(i, 0));
        }
        return result;
    }
    public static void main(String[] args) {
        frequencyCount fc = new frequencyCount();
        int[] arr = {0, 1, 0, 1, 1, 0};
        List<Integer> result = fc.frequencyCount(arr);
        System.out.println("Frequency of 0: " + result.get(0));
        System.out.println("Frequency of 1: " + result.get(1));
    }
}
