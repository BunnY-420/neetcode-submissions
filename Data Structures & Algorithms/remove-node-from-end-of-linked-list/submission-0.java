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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz=sizeLL(head);
        int i=1;
        ListNode temp=head;
        if(sz==n){
            return head.next;
        }
        while( i<sz-n){
            i++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

    }

    public int sizeLL(ListNode head){
        int sz=0;
        ListNode temp=head;

        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        return sz;
    }
}
