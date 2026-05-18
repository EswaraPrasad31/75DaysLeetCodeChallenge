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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1=0,len2=0;
        ListNode temp=l1;
        while(temp!=null){
            len1++;
            temp=temp.next;
        }
        ListNode temp2=l2;
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode res=ans;
        int max=Math.max(len1,len2);
        while(max-->0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            ans.next=new ListNode(sum%10);
            ans=ans.next;
            carry=sum/10;
        }
        if(carry==1){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return res.next;
    }
}