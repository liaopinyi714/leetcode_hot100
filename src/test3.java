public class test3 {
    public void moveZeroes(int[] nums) {
        int fast=0;
        int slow=0;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=0){
                nums[slow++]=nums[fast];
            }
        }
        for(int i=slow;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
