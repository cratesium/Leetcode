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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>mainList= new ArrayList<>();
        List<Integer>list= new ArrayList<>();

        Queue<TreeNode>q= new LinkedList<>();
        if(root==null) return mainList;
        else{
          q.add(root);     
                
        }
        while(!q.isEmpty()){
            TreeNode head=q.poll();
            if(head.left!=null){
                q.add(head.left);
            }
            if(head.right!=null){
                q.add(head.right);
            }
            list.add(head.val);
          


        }
        mainList.add(list);
        return mainList;
        
        
    }
}