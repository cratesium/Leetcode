/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        return null;
      ListNode temp1=headA;
      ListNode temp2=headB;
      Map<ListNode , Boolean > mp = new HashMap<>();
      while(temp1!=null)
      {
        mp.put(temp1,true);
        temp1=temp1.next;
      }
      while(temp2!=null)
      {  Boolean b=true;
        if(mp.get(temp2)==b)
        return temp2;
        else
        temp2=temp2.next;
      }
     return null;   
        
    }
}