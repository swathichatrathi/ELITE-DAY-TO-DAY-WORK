/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static class Pair{
        public Node node;
        public int offset;
        public Pair(Node node, int offset){
            this.node = node;
            this.offset = offset;
        }
    }
    public static void topView(Node root){
        if(root == null) return;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            Node node = pair.node;
            int offset = pair.offset;
            if(!map.containsKey(offset)){
                map.put(offset,node.data);
            }
            if(node.left!=null){
                q.add(new Pair(node.left,offset-1));
            }
            if(node.right != null){
                q.add(new Pair(node.right,offset+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
    }
