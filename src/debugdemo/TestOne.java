package debugdemo;

import java.util.*;
import java.util.stream.Collectors;

public class TestOne {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Monkey");
        HashMap<Integer, Integer> map;
        TreeMap<Integer , Integer> result = new TreeMap<>(Comparator.comparingInt(o -> o));
        ArrayList<Integer> values = new ArrayList<>(result.values());
        int k = 3;
        for (int i = 0, j = 0; i < values.size() & j < k; i++) {
            if (values.get(values.size()-1) == 0){
                break;
            }
            if (j == values.size()){
                i = 0;
            }
            if (values.get(i) > 0){
                values.set(i, values.get(i) -1);
                j++;
            }
        }
        values.stream().filter(item->item > 0).collect(Collectors.toList()).size();
        outer:for(int j = 0; j < k; j++){
            for (int i = 0; i < values.size(); i++) {
                if (values.get(values.size()-1) == 0){
                    break outer;
                }
                if (values.get(i) > 0){
                    values.set(i, values.get(i) - 1);
                } else{
                }
            }
        }
    }
}

