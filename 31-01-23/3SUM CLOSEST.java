// 3SUM CLOSEST 

//SOLUTION IN JAVA 

class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int low=i+1;
            int high=arr.length-1;
            int diff;
            while(low<high){
               if(arr[low]+arr[high]+arr[i]<=target){
                    diff=target-(arr[low]+arr[high]+arr[i]);
                    ans=Math.min(ans,diff);
                    if(ans==diff) res=arr[low]+arr[high]+arr[i];
                    low++;
                }
                else{
                    diff=(arr[low]+arr[high]+arr[i])-target;
                    ans=Math.min(ans,diff);
                    if(ans==diff) res=arr[low]+arr[high]+arr[i];
                    high--;
                }
            }
        }
        return res;
    }
}
