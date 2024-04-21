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
    public boolean isValidBST(TreeNode root) {
        return isbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean  isbst(TreeNode root,long minvalue,long maxvalue){
        if(root==null) return true;
        if(root.val>=maxvalue || root.val<=minvalue) return false;
        if(root.left!=null && root.right!=null){
            if(root.left.val>=root.val || root.val>=root.right.val)
            return false;
        }
        return isbst(root.left,minvalue,root.val) && isbst(root.right,root.val,maxvalue);


    }
    
}