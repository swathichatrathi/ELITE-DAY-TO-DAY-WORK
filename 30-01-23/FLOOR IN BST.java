// FLOOR IN BST 

//SOLUTION IN JAVA 

class Solution {
    public static int floor(Node root, int key) {
        // Code here
        if(root==null) return -1;
        int floor=Integer.MAX_VALUE;
        Node curr=root;
        while(curr!=null){
            if(curr.data==key) return key;
            if(curr.data<key){
                floor=curr.data;
                curr=curr.right;
            }
            else curr=curr.left;
        }
        if(floor==Integer.MAX_VALUE) return -1;
        else return floor;
    }
}
