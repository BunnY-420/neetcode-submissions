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
    public void reorderList(ListNode head) {
       ListNode gm=getMid(head);

       ListNode curr=gm.next;
       gm.next=null;

       ListNode rev=reverse(curr);
       ListNode nextL,nextR;

       while(head!=null && rev!=null){
        nextL = head.next;
            nextR = rev.next;

            head.next = rev;
            rev.next = nextL;

            head = nextL;
            rev = nextR;
       } 
    }
    public ListNode getMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
