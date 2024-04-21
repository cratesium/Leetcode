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
    public static class Pair {
        int data;
        ListNode node;
        public Pair(ListNode Node ){
            this.data=Node.val;
            this.node=Node;
        }
       // @override
      
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null) return null;
        if(lists.length==1) return lists[0];
        ListNode dummyNode = new ListNode (-1);
        ListNode temp=dummyNode; 
        PriorityQueue<Pair> pq = new PriorityQueue<>( new Comparator<Pair>(){
            public int compare( Pair o1 , Pair o2){
                return Integer.compare(o1.data,o2.data);
            }
        });
        for( ListNode i : lists){
            if(i!=null)
            pq.add(new Pair(i)); 
        }
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            temp.next=p.node;
            temp=temp.next;
            if(p.node.next!=null){
                pq.add(new Pair(p.node.next));
            }
        }
        return dummyNode.next;

     
        
    }
}
