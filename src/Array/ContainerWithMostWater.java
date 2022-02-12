package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    static int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return max;
    }

//    Failing for [1, 2, 1]
//    static int maxArea(int[] height) {
//        int answer = 0;
//
//        int max = height[0];
//        int maxIndex = 0;
//        for(int i = 0; i < height.length; i++){
//            if(height[i] > max){
//                max = height[i];
//                maxIndex = i;
//            }
//        }
//
//        int secondMax = height[height.length - 1];
//        int secondMaxIndex = height.length - 1;
//        int count = 0;
//        for(int i = height.length - 1; i >= 0; i--){
//            if(height[i] >= secondMax && Math.abs(secondMaxIndex - maxIndex) > count){
//                secondMax = height[i];
//                secondMaxIndex = i;
//                count = Math.abs(secondMaxIndex - maxIndex);
//            }
//        }
//
//        answer = secondMax * count;
//
//        return answer;
//    }
}