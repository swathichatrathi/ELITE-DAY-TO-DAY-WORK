// LONGEST CONSECUTIVE SEQUENCE 

//SOLUTION IN JAVA 

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maximumlength=0;
        for(int i=0;i<nums.length;i++){
            int length=0;
            if(!set.contains(nums[i]-1)){
                while(set.contains(nums[i]++)) length++;
                if(length>maximumlength) maximumlength=length;
            }
        }
        return maximumlength;
    }
}
