package com.binarysearch;

public class RBS {

    public static void main(String[] args) {
        int[] array = {7, 6, 5, 4, 0, 1, 2, 3};
        System.out.println(search(array, 5));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] array){
        int start = 0, end = array.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && array[mid] > array[mid + 1]){
                return mid;
            } else if(mid > start && array[mid] < array[mid - 1]){
                return mid - 1;
            } else if(array[mid] <= array[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(array[mid] == target) {
                return mid;
            } else if(target < array[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
