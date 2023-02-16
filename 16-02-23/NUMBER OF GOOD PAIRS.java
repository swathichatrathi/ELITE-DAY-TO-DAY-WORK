class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            sum+=e.getValue()*(e.getValue()-1)/2;
        }
        return sum;
    }
}
