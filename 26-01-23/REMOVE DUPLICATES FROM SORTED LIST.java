//4)REMOVE DUPLICATES FROM SORTED LIST 

//SOLUTION IN JAVA 

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        if(head==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null){
            if(temp.val==prev.val){
                temp=temp.next;
                prev.next=temp;
            }
            else{
                prev=prev.next;
                temp=temp.next;
            }
        }
        return curr;
    }
}
