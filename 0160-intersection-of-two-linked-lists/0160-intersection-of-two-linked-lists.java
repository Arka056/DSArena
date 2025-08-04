/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(a!= null){
            sizeA ++;
            a = a.next;
        }
        a = headA;    
        while(b!= null)
        {
            sizeB ++;
            b = b.next;
        }
        b = headB;
        if(sizeA > sizeB){
        for(int i = 1; i <= sizeA - sizeB; i++)
        {
            a = a.next;
        }
        }
        else
        {
            for(int i = 1; i <= sizeB - sizeA; i++)
        {
            b = b.next;
        }
        }
        while(a != b)
        {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}