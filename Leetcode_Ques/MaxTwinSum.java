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
    public int pairSum(ListNode head) {
        if(head == null)return 0;
        int max=0;
        int size=0;
        Stack<Integer> stk = new Stack<>();
        ListNode hd=head;
        while(hd != null){
            stk.push(hd.val);
            size++;
            hd=hd.next;
        }
        ListNode jj=head;
        int ptr=0;
        while(ptr != size/2){
            max = Math.max(max , jj.val+stk.pop());
            jj=jj.next;
            ptr++;
        }
        return max;
    }
}