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
    public static int nextgreater(ListNode head, int a ){
ListNode  tempnode = head;
   while(tempnode!=null)
   {

    if(tempnode.val>a){
        return tempnode.val;

    }
    tempnode=tempnode.next;
   
   }
   return 0;

    }
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        if(head==null || head.next==null ) return new int[]{0};
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;

            size++;
        }

        int []nums= new int [size];
        temp=head;
        int i=0;
        while(temp!=null){
           nums[i++]=nextgreater(temp,temp.val);
            temp=temp.next;

        }
        return nums;
        
    }
}
