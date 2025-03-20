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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode third = null;
        ListNode last = null;
        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;
        else
        {
            if(list1.val <= list2.val)
                {
                    third = last = list1;
                    list1 = list1.next;
                }
            else if(list2.val <= list1.val)
                {
                    third = last = list2;
                    list2 = list2.next;
                }
            while(list1 != null && list2 != null)
            {
                if(list1.val <= list2.val)
                {
                    last.next = list1;
                    last = list1;
                    list1 = list1.next;
                }
                else
                {
                    last.next = list2;
                    last = list2;
                    list2 = list2.next;
                }
            }
            if(list1 != null)
            {
                last.next = list1;
            }
            else{last.next = list2;}
            return third;
        }
    }
}