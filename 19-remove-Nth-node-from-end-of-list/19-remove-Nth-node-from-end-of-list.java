// Question Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        if(n == count)
            return head.next;
        else if(n > count)
            return head;

        count = count-n;
        temp = head;

        while(count > 1){
            count--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
