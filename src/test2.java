import java.util.*;

public class test2 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Object[] arr;
        arr = list.toArray();
        Arrays.sort(arr);
        int maxint = 1;
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if ((Integer)arr[i]+1 == (Integer) arr[i + 1]) {
                count++;
            } else if (count > maxint) {
                maxint = count;
                count = 1;
            } else {
                count = 1;
            }
        }

        maxint=Math.max(maxint,count);
        return maxint;
    }
}
