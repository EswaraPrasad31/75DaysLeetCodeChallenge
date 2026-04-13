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
    static int size(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        int length=size(head);
        if(n==length){
            return head.next;
        }
        int lastnode=length-n-1;
        ListNode temp=head;
        for(int i=0;i<lastnode;i++){
            head=head.next;
        }
        head.next=head.next.next;
        return temp;
    }
}