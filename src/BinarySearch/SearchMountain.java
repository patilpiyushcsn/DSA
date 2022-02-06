package BinarySearch;

public class SearchMountain {

    public static void main(String[] args) {
        int[] array = {8, 12, 33, 21, 14};
        System.out.println(searchMountain(array, 33));
    }

    static int searchMountain(int[] array, int target){
        int answer = -1;

        int peakElementIndex = peakIndexInMountainArray(array);

        int firstTry = orderAgnosticBS(array, target, 0, peakElementIndex);

        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(array, target, peakElementIndex + 1, array.length - 1);
    }

    static int peakIndexInMountainArray(int[] array) {
        int start = 0, end = array.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(array[mid] < array[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] array, int target, int start, int end){
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
