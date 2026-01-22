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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0 ; i<lists.length ; i++)
        {
            while(lists[i]!=null)
            {
                minHeap.add(lists[i].val);
                lists[i]=lists[i].next;
            }
            
        }

        ListNode result = new ListNode();

        ListNode tail = result;

        while(!minHeap.isEmpty())
        {
            tail.next=new ListNode(minHeap.poll());
            tail = tail.next;
        }

        return result.next;
        
    }

    
}
















