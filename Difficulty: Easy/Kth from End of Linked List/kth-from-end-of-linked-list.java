/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    Node reverseList(Node head) {
    Node prev = null;
    while (head != null) {
        Node next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}

int getKthFromLast(Node head, int k) {
    Node rev = reverseList(head);
    for (int i = 1; i < k && rev != null; i++) {
        rev = rev.next;
    }
    return (rev != null) ? rev.data : -1;
}

}