//Count Subarrays with Given XOR

//Solution in java




import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		HashMap<Integer,Integer>map=new HashMap<>();
        int cxor=0; 
		int count=0;
        for(int i=0;i<arr.size();i++){
            cxor=cxor ^ arr.get(i);  
			if(cxor==x){
				count++;
			}
			if(map.containsKey(cxor ^ x)){
				count+=map.get(cxor ^ x);
			} 
            if(map.containsKey(cxor)){
				map.put(cxor,map.get(cxor)+1);
            }
            else{
                map.put(cxor,1); 
            }
        }
        return count; 
	}
}
