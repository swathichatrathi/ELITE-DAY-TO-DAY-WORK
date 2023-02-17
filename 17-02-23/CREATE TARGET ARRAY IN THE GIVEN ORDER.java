class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> tres=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            tres.add(index[i],nums[i]);
        }
        int[] res=new int[tres.size()];
        for(int i=0;i<tres.size();i++){
            res[i]=tres.get(i);
        }
        return res;
    }
}
