package com.binarysearch;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // Apply BinarySearch
        while(start < end){
            int sum = 0;
            int pieces = 1;

            int mid = start + (end - start) / 2;

            for (int num :nums) {
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces <= m){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end; // start == end
    }
}
