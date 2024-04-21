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
    public static ListNode reverseList (ListNode head){
        ListNode prev=null;
        ListNode curr,next;
        curr=head;
        while(curr!=null)
        {  
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode head1;
             ListNode head2;
        if(l1.next!=null)
        head1=reverseList(l1);
        else
        head1=l1;
        if(l2.next!=null)
        head2=reverseList(l2);
        else
        head2=l2;
                  

        ListNode temp1=head1;
        ListNode temp2=head2;
        int carry=0;
        ListNode dummynode=new ListNode (-1);
        ListNode curr=dummynode;
        while(temp1!=null || temp2!=null){

        
            int sum=0;
            sum=carry;
            if(temp1!=null) {
            sum+=temp1.val;
            }
            if(temp2!=null){
             sum+=temp2.val;

            }

            ListNode newnode=new ListNode(sum%10);
            curr.next=newnode;
            curr=curr.next;
            carry=sum/10;

            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;





        }
        if(carry!=0){
        ListNode newN=new ListNode(carry);
        curr.next=newN;
        }
        curr=dummynode.next;
        dummynode.next=null;

        return reverseList(curr);



        
    }
}