package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArray = {1, 3, 5, 6, 10, 34, 45, 56, 77};
        int[] descArray = {77, 56, 45, 10, 6, 5, 3, 2, 1};
        int target = 56;
        System.out.println(orderAgnosticBS(descArray, target));
    }

    static int orderAgnosticBS(int[] array, int target){
        int start = 0, end = array.length - 1;

        boolean isAsc = array[start] < array[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(array[mid] == target) {
                return mid;
            }

            if(isAsc){
                if(target < array[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < array[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
