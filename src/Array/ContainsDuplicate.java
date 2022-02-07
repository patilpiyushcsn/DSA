package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}
