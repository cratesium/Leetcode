
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
    List<Integer>list;
    public void REVERSEinorder(TreeNode root){
    if(root==null) return;
        REVERSEinorder(root.right);

    list.add(root.val);
     REVERSEinorder(root.left);


    }
    public int getMinimumDifference(TreeNode root) {
        list=new ArrayList<>();
        REVERSEinorder(root);
      int min=Integer.MAX_VALUE;
        for(int i=0 ;i<list.size()-1;i++)
        {    
            min= Math.min(min,list.get(i)-list.get(i+1));
            if(min==0) break;
        }

      return min;  
    }
}