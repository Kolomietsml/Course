import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Integer[]arr = {4,5,-6,4,5,3,4,2,4,5,7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer i : list){
            result.computeIfPresent(i, (k, v) -> v+1);
            result.computeIfAbsent(i, k -> result.put(k, 1));
        }
        System.out.println(result);
    }
}
