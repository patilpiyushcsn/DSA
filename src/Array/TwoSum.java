package Array;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSumBruteForce(new int[]{3,2,4}, 6));
        System.out.println(twoSumOptimised(new int[]{3,2,4}, 6));
        System.out.println(twoSumSortedOptimised(new int[]{1, 2, 3, 7, 10}, 9));
    }

    static List<Integer> twoSumBruteForce(int[] array, int target){
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    answer.add(i);
                    answer.add(j);
                }
            }
        }

        return answer;
    }

    static List<Integer> twoSumOptimised(int[] array, int target){
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(target - array[i])){
                answer.add(map.get(target - array[i]));
                answer.add(i);
                return answer;
            } else {
                map.put(array[i], i);
            }
        }

        return answer;
    }

    // Hint: Use two pointer approach only if the input array is sorted
    static List<Integer> twoSumSortedOptimised(int[] array, int target){
        List<Integer> answer = new ArrayList<>();

        int start = 0, end = array.length - 1;

        while(start < end){
            if(array[start] + array[end] == target){
                answer.add(start);
                answer.add(end);
                return answer;
            } else if(array[start] + array[end] < target){
                start++;
            } else {
                end--;
            }
        }

        return answer;
    }
}
