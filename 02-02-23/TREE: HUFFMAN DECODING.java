/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root){
        Node curr=root;
        String res=new String("");
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }
                if(curr.left==null && curr.right==null){
                    res+=curr.data;
                    curr=root;
                }
        }  
        System.out.print(res);
    }
