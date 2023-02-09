class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res=new StringBuilder();
        for(char i:address.toCharArray()){
            if(i=='.') res.append("[.]");
            else res.append(i);
        }
        return res.toString();
    }
}
