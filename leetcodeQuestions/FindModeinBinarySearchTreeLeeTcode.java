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
    Map<Integer,Integer>mp= new HashMap<>();
    public void inorder(TreeNode root){
        if (root==null) return ;
        inorder(root.left);
        if(mp.get(root.val)==null)
        mp.put(root.val,1);
        else{
            mp.put(root.val,mp.get(root.val)+1);
        }
        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        int maxfreq=0;
        for(var v : mp.entrySet()){
            maxfreq=Math.max(maxfreq,v.getValue());

        }
        int mode[]=new int[10000];
        Arrays.fill(mode,Integer.MIN_VALUE);
        int i=0;
        for( var v : mp.entrySet()){

            if(v.getValue()==maxfreq){
             mode[i++]=v.getKey();


            }
        }
        for( i=0;i<mode.length;i++){
            if(mode[i]==Integer.MIN_VALUE){
                break;
            }
        }
        return Arrays.copyOf(mode,i);


        
    }
}