package BinarySearch;

public class Mountain {

    public static void main(String[] args) {
        int[] array = {8, 12, 33, 21, 14};
        System.out.println(peakIndexInMountainArray(array));
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

        return array[start];
    }
}
