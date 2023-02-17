class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<=nums.length/2-1;i++){
            int f=nums[2*i];
            int e=nums[2*i+1];
            for(int j=0;j<f;j++){
                l.add(e);
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
