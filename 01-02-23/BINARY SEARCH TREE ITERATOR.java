// BINARY SEARCH TREE ITERATOR 

//SOLUTION IN JAVA 

class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    public int next() {
        TreeNode node=stack.pop();
        pushAll(node.right);
        return node.val;
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public void pushAll(TreeNode node){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
}
