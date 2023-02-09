// CONCATENATION OF ARRAY 

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] lis=new int[2*n];
        for(int i=0;i<n;i++){
            lis[i+nums.length]=lis[i]=nums[i];
        }
        return lis;
    }
}
