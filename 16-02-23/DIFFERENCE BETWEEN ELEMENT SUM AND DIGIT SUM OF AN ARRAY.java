class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
            while(nums[i]>0){
                int r=(nums[i]%10);
                digitsum+=r;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(elementsum-digitsum);
    }
}
