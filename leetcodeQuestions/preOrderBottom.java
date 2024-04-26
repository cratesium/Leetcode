/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>mainList= new ArrayList<>();
         Queue<TreeNode>q=new LinkedList<>();
         Stack<List<Integer>>st= new Stack(); 
          if(root==null){
            return mainList;

          }
          else{
            q.add(root);
          }
          while(!q.isEmpty()){
            int level=q.size();
            List<Integer>list= new ArrayList<>();

            for(int i=0;i<level;i++){
                TreeNode head=q.poll();
                list.add(head.val);
                if(head.left!=null){
                    q.add(head.left);

                }
                if(head.right!=null){
                    q.add(head.right);
                }

            }
               st.push(list);
             //System.out.println(list);

          }
        //  System.out.println(st);
          while(!st.isEmpty()){
            mainList.add(st.pop());
          }
          return mainList;
        
    }
}


//method 2 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>mainList= new ArrayList<>();
         Queue<TreeNode>q=new LinkedList<>();
       //  Stack<List<Integer>>st= new Stack(); 
          if(root==null){
            return mainList;

          }
          else{
            q.add(root);
          }
          while(!q.isEmpty()){
            int level=q.size();
            List<Integer>list= new ArrayList<>();

            for(int i=0;i<level;i++){
                TreeNode head=q.poll();
                list.add(head.val);
                if(head.left!=null){
                    q.add(head.left);

                }
                if(head.right!=null){
                    q.add(head.right);
                }

            }
               mainList.add(list);
             //System.out.println(list);

          }
        //  System.out.println(st);
        //   while(!st.isEmpty()){
        //     mainList.add(st.pop());
        //   }
          
           Collections.reverse(mainList);
           return mainList;
        
    }
}

