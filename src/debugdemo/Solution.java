package debugdemo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hp
 */
public class Solution {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        List<String> collect = Arrays.stream(arr).mapToObj(item -> "" + item).collect(Collectors.toList());
        HashMap<String, Integer> countMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String item = collect.get(i);
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }
        LinkedHashMap<String, Integer>  tem = new LinkedHashMap<>();
        countMap.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).forEach(item->tem.put(item.getKey(), item.getValue()));
        ArrayList<Integer> values = new ArrayList<>(tem.values());
        for (int i = 0, j = 0; i < values.size() & j < k;) {
            if (values.get(values.size()-1) == 0){
                break;
            }
            if (values.get(i) > 0){
                values.set(i, values.get(i) -1);
                j++;
            } else{
                i++;
            }

        }
        return values.stream().filter(item->item > 0).collect(Collectors.toList()).size();
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,3,3,3};
        int k=3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }
}
