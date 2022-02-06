package com.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {8, 12, 33, 43, 54, 56};
        System.out.println(binarySearch(array, 33));
    }

    static int binarySearch(int[] array, int target) {
        int start = 0, end = array.length - 1;

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
