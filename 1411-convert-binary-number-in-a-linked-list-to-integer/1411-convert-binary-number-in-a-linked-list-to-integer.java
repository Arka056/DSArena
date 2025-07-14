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
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0;
        StringBuilder str = new StringBuilder();
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        int decimalValue = Integer.parseInt(str.toString(), 2);
    return decimalValue;
    }
}