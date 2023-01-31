//  ZERO SUM SUBARRAYS 

//SOLUTION IN JAVA 

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0; 
        for(int i=0;i<n;i++){
            sum+=arr[i]; 
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
        }
        return count; 
    }
}
