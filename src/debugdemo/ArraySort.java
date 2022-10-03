package debugdemo;

import java.security.SecureRandom;

/**
 * @author hp
 */
public class ArraySort {
    /**
     * 选择排序
     * @param arr 待排序的数组
     */
    public static int[] selectSort(int[] arr){
        if (null == arr){
            throw new NullPointerException();
        }
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 0, len = arr.length; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static boolean isOrdered(int[] arr){
        for (int i = 1, len = arr.length ; i < len; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 冒泡排序
     * @param arr 待排序数组
     * @return
     */
    public static int[] bubleSort(int[] arr){
        if (null == arr){
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int len = arr.length;
        if (len == 1) {
            return arr;
        }
        for (int i = 0; i < len -1 ; i++) {
            for (int j = 1; j < len-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * 插入排序
     * @param arr 待排序的数组
     * @return 排序后的数组
     */
    public static int[] insertSort(int[] arr){
        if (null == arr){
            throw new NullPointerException();
        }
        int len = arr.length;
        if (len == 0){
            throw new IllegalArgumentException();
        }
        if (len == 1) {
            return arr;
        }
        for (int i = 1; i < len; i++){
            int j = i;
            do {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j--]=tmp;
                } else {
                    break;
                }
            } while (j>0);
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int k = 0; k < 50000; k++) {
            int maxLen = 50;
            int maxValue = 1000;
            SecureRandom random = new SecureRandom();
            int[] ints = new int[random.nextInt(maxLen)+ 1];
            for (int i = 0, len = ints.length; i < len; i++) {
                int value = random.nextInt(maxValue);
                ints[i] = value;
            }
//            selectSort(ints);
//            bubleSort(ints);
            insertSort(ints);
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + "\t");
            }
            if (!isOrdered(ints)){
                System.out.println("There has bugs in programme");
                break;
            }
            System.out.println();
        }
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();

    }
}
