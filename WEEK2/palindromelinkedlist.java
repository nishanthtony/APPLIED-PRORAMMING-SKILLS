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
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {

        List<Integer> l1 = new ArrayList<>();
        ListNode cur = head;
        
        while(cur!=null)
        {
            l1.add(cur.val);
            cur=cur.next;
        }

        int j= l1.size()-1;

        for(int i=0 ; i< l1.size()/2 ; i++)
        {
            if(l1.get(i) != l1.get(j))
            {
                return false;
            }
            j--;
        }

        return true;

    }
}
