public class Solution {

    static int length(ListNode node)
    {
        int len=0;
        while(node!=null)
        {
            len++;
            node=node.next;
        }

        return len;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB==null )
        {
            return null;
        }

        int len_a = length(headA);
        int len_b = length(headB);

        while(len_a>len_b)
        {
            headA=headA.next;
            len_a--;
        }

        while(len_b>len_a)
        {
            headB=headB.next;
            len_b--;
        }

        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }

        return headA;
        
    }
}
