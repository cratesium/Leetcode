/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next;
        ListNode end=getMiddle(head);
        while(curr!=end){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public ListNode getMiddle(ListNode head){
           ListNode slow =head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           }

           return slow;


    }
    public void print(ListNode head ){
      ListNode   temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        
    }
    public TreeNode tree(ListNode head) {
        if(head==null) return null;
        ListNode middle=getMiddle(head);
        ListNode h1=middle.next;
        ListNode h2=reverse(head);
        print(h1);
        print(h2);
        TreeNode root=new TreeNode(middle.val);
        while(h1!=null){
            root.right= new TreeNode(h1.val);
            h1=h1.next;
        }
        while(h2!=null){
            root.left= new TreeNode(h2.val);
            h2=h2.next;
        }
             
            
           


        


            return root;
        
    }   
    
}