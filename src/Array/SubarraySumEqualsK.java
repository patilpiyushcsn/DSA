package Array;

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{-1,-1,1}, 0));
    }

    static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

//    static int subarraySum(int[] nums, int k) {
//        int start = 0, end = 0, sum = 0;
//        int max = 0;
//        while (end < nums.length) {
//            sum += nums[end];
//            if (sum < k) {
//                end++;
//            } else if (sum == k) {
//                max += 1;
//                end++;
//            } else if (sum > k) {
//                while (sum > k) {
//                    sum = sum - nums[start];
//                    start++;
//                }
//
//                if((sum == k && start != end && start < nums.length && end < nums.length) ||
//                        (sum == k && start == end && start < nums.length && end < nums.length)){
//                    max += 1;
//                }
//
//                end++;
//            }
//        }
//
//        return max;
//    }
}
