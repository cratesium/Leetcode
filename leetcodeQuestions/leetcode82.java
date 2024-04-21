/**

     Map<Integer,ListNode>mp=new LinkedHashMap<>();
        Map<Integer,Integer>mp1=new LinkedHashMap<>();

        ListNode DummyNode = new ListNode(-1), temp=head;
        ListNode t=DummyNode;
        while(temp!=null)
        {
            mp.put(temp.val,temp);
            temp=temp.next;
            if(mp1.get(temp.val)==null)
            mp1.put(temp.val,1);
            else{
                Integer c = mp1.get(temp.val);
                mp1.put(temp.val,c+1);
            }
        }

        for( var v : mp.entrySet()){
            if(mp1.get(v.getKey())>1)
            continue;
            else
           {
             t.next=v.getValue();
              t=t.next;
           }

        }
        t.next=null;
        return DummyNode.next;
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        if((head.val==head.next.val) && head.next.next==null) return null;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
       ListNode temp=head,prev=dummyNode;
        while(temp!=null && temp.next!=null)
        {  

            if(temp.val!=temp.next.val){
                prev=temp;
                temp=temp.next;
            }
            else{
                ListNode ptr=temp.next;
                while(   ptr!=null && ptr.val==temp.val  ) {
                 ptr=ptr.next;
                }
                if(prev!=null){
                prev.next=ptr;
                temp=ptr;
                }
              



            }
        }
       return dummyNode.next; 
        
    }
}