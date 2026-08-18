public class test4 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int maxtemp = 0;
            maxtemp = Math.min(height[left], height[right]) * (right - left);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                right--;
            }

            if (maxtemp > max) {
                max = maxtemp;
            }
        }
        return max;


    }
}
