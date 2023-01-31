// 3 SUM 

//SOLUTION IN JAVA 

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int target2=0-arr[i];
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                if(arr[low]+arr[high]==target2){
                    set.add(Arrays.asList(arr[i],arr[low],arr[high]));
                    low++;
                    high--;
                }
                else if(arr[low]+arr[high]<target2){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
