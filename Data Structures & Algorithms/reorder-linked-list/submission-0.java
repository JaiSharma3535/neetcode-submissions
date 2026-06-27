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
        if (head == null || head.next == null) {
            return;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        ListNode[] arr = new ListNode[count];
        temp = head;
        for (int i = 0; i < count; i++) {
            arr[i] = temp;
            temp = temp.next;
        }

        int i = 0, j = count - 1;
        while (i < j) {
            arr[i].next = arr[j];
            i++;

            if (i == j) {
                break;
            }

            arr[j].next = arr[i];
            j--;
        }

        arr[i].next = null;
    }
}