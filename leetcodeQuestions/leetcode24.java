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
class Solution {
    public static ListNode swap(ListNode head)
    {       
           ListNode temp=head,curr=head,prev=null,next;
           if(head==null || head.next==null) return null;

               next=curr.next;
               curr.next=prev;
               prev=curr;
               curr=next;
               head=head.next.next;
           return    prev.next=swap(head);
                }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
     
       ListNode dummyNode = new ListNode(-1);
              dummyNode.next=head;
       swap(head);
   return dummyNode.next;




    }
}