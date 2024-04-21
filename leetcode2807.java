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
   
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null ) return head;
       ListNode  temp1=head;
       ListNode temp2=head.next;
        while(temp2!=null)

        {int  n1=temp1.val;
          int n2=temp2.val;
             while(n1!=n2)
             {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
               }
             int  gcd=n1;
             
            ListNode newNode = new ListNode (gcd);
            newNode.next=temp2;
            temp1.next=newNode;
            temp1=temp2;
            temp2=temp2.next;
        }
        return head;

        
    }
}
