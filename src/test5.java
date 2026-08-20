import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test5 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int left;
        int right;
        for(int i=0;i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            left=i+1;
            right=nums.length-1;
            while(left<right){
                int sum =nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }
            }

        }
        return res;


    }


}
