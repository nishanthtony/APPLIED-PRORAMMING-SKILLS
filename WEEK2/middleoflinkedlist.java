class Solution {

    public int get_length(ListNode head){
        int count= 0;
        ListNode cur = head;

        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }

        return count;
    }

    public ListNode middleNode(ListNode head) {

        int Length = get_length(head);

        ListNode temp=head;

        int mid = Length/2;

        for(int i=0 ; i<mid ; i++){
            temp=temp.next;
        }
        return temp;

    }
}
