class Solution {
    List<Integer>list;
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null ) return new ArrayList<Integer>();
        list = new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
             int size=q.size();
            for( int i=0 ;i<size;i++)
            {      
                   TreeNode head= q.poll();
                       if(i==size-1){
                        list.add(head.val);
                       }  

                if(head.left!=null)
                q.add(head.left);
               
                if(head.right!=null)
                {
                    q.add(head.right);
                }
            }

        }
        // System.out.println(mainList);
        return list;

        
    }
}