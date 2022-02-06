package com.binarysearch;

public class SmallestGreaterCharacter {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        System.out.println(ceiling(array, 'd'));
    }

    static int ceiling(char[] array, char target) {
        int start = 0, end = array.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < array[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return array[start % array.length];
    }
}
