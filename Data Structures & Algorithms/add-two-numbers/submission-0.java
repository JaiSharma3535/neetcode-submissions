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
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        while(l1!=null){
            num1.append(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            num2.append(l2.val);
            l2=l2.next;
        }
              num1.reverse();
        num2.reverse();

        long n1 = Long.parseLong(num1.toString());
        long n2 = Long.parseLong(num2.toString());

        long sum = n1 + n2;

        String s = new StringBuilder(String.valueOf(sum)).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(char c : s.toCharArray()){
            curr.next = new ListNode(c - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}