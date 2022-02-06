package com.binarysearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(array, target));
    }

    static int[] searchRange(int[] array, int target) {
        int[] answer = new int[]{-1, -1};

        answer[0] = binarySearch(array, target, true);
        if(answer[0] != -1){
            answer[1] = binarySearch(array, target, false);
        }

        return answer;
    }

    static int binarySearch(int[] array, int target, boolean startIndex) {
        int start = 0, end = array.length - 1, answer = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(array[mid] == target) {
                // Potential answer has found
                answer = mid;
                if(startIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(target < array[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }
}
