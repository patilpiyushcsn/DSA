package com.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] array = {8, 12, 33, 43, 54, 56, 120, 140, 200, 250, 260, 270, 280, 290, 300, 310};
        System.out.println(findingRange(array, 140));
    }

    static int findingRange(int[] array, int target){
        int start = 0, end = 1;

        while(target > array[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(array, target, start, end);
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
