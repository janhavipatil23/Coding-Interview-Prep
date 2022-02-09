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
        
    ListNode tempList = new ListNode(0);
    ListNode head = tempList;

    int val1 = 0;
    int val2 = 0;
    int carry = 0;
    
    while(l1 !=null || l2!=null){
        val1 = l1 != null ? l1.val: 0;
        val2 = l2 != null ? l2.val: 0;
        int sum = val1 + val2 + carry;
        tempList.next = new ListNode(sum % 10);
        tempList = tempList.next;
        tempList.next = null;
        carry = sum /10;
        
        l1 = l1 != null ? l1.next : l1;
        l2 = l2 != null ? l2.next : l2;
    }
    
    
    if(carry > 0){
        tempList.next = new ListNode(carry);
        tempList = tempList.next;
        tempList.next = null;
    }
    
    return head.next;
        
    }
}