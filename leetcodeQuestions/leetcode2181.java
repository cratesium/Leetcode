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
    public ListNode mergeNodes(ListNode head) {
        if(head==null ||  head.next==null || head.next.next==null) return null;

        ListNode mynode= new ListNode(0);
     ListNode t1,t2,t3;
     t1=head;
     t2=mynode;
     int sum=0;
     while(t1!=null){
        if(t1.val!=0){
            sum+=t1.val;
        }
        if(t1.val==0){
            t2.next=new ListNode(sum);
            t2=t2.next;
            sum=0;

        }
        t1=t1.next;





     }


    return mynode.next.next;


    }

        
        
    }
