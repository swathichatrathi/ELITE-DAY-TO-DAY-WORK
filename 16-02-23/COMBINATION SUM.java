class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        helper(0,target,candidates,new ArrayList<>(),res);
        return res;
    }
    public static void helper(int i,int target,int[] candidates,List<Integer> list,List<List<Integer>> res) {
        if(i==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            list.add(candidates[i]);
            helper(i,target-candidates[i],candidates,list,res);
            list.remove(list.size()-1);
        }
        helper(i+1,target,candidates,list,res);
    }
}
