class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder res=new StringBuilder("");
        char[] tres=new char[s.length()];
        for(int i=0;i<s.length();i++){
            tres[indices[i]]=s.charAt(i);
        }
        res.append(tres);
        return res.toString();
    }
}
