// LONGEST SUBARRAY 0 SUM

//SOLUTION IN JAVA 

import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
	HashMap<Integer,Integer>map=new HashMap<>();
        int maxl=0;
        int sum=0; 
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i); 
            if(sum==0){
                maxl=i+1; 
            }
            else{
                if(map.containsKey(sum)){
                    maxl=Math.max(maxl,i-map.get(sum)); 
                }
                else{
                    map.put(sum,i); 
                }
            }
        }
        return maxl; 
    }
}
