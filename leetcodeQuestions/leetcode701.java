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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null ){
            TreeNode newNode = new TreeNode (val);
              return root=newNode;
        }
                 TreeNode curr=root,parentNode = null;
                 
                 
                 while(true){
                    if(val<curr.val){
                        if(curr.left!=null){
                            parentNode=curr;
                            curr=curr.left;
                        }else{
                            TreeNode newNode= new TreeNode(val);
                            curr.left=newNode;
                            break;

                        }




                    }else{
                        if(curr.right!=null){
                            parentNode=curr;
                            curr=curr.right;
                        }else{
                            TreeNode newNode= new TreeNode(val);
                            curr.right=newNode;
                            break;

                        }




                    }
                  





                 }
                 return root;
  
        
    }
}
