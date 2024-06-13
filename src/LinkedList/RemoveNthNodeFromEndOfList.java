package LinkedList;
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

public class RemoveNthNodeFromEndOfList
{
    /**
     * public ListNode removeNthFromEnd(ListNode head, int n)
     *     {
     *         int length = 0;
     *         ListNode current = head;
     *
     *         while (current!=null)
     *         {
     *             length++;
     *             current = current.next;
     *         }
     *         if (n == length) {
     *             return current.next;
     *         }
     *
     *         current = head;
     *         int count = 0;
     *         int target = length-n;
     *         ListNode prev = null;
     *
     *
     *         while (count!=target)
     *         {
     *             count++;
     *             prev = current;
     *             current = current.next;
     *         }
     *         if (prev != null && head != null) {
     *             prev.next = head.next;
     *         }
     *         return current;
     *     }
     */

}
