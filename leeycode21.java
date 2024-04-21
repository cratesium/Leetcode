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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1==null && h2==null)  return null;
        if(h1==null && h2!=null ) return h2;
        if(h1!=null && h2==null) return h1;
        ListNode FirstNode= new ListNode(0);
        ListNode temp=FirstNode;
        while(h1!=null && h2!=null){
            if(h1.val>=h2.val){
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;
                temp.next=null;

            }else{
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
                temp.next=null;
            }
        }
        if(h1!=null)
        temp.next=h1;
        if(h2!=null)
        temp.next=h2;


        return FirstNode.next;
        
    }
}