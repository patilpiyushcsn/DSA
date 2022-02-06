package com.binarysearch;

public class Ceiling {

    public static void main(String[] args) {
        int[] array = {8, 12, 33, 43, 54, 56};
        System.out.println(ceiling(array, 87));
    }

    static int ceiling(int[] array, int target) {
        if(target > array[array.length]){
            return -1;
        }

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

        return start;
    }
}
