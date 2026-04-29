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
        ArrayList<Integer> gg=new ArrayList<>();
        ListNode gf=head;
        while(gf != null){
            gg.add(gf.val);
            gf=gf.next;
        }
        int sum=0;
        int mul=1;
        for(int i=gg.size()-1; i>=0; i--){
            if(gg.get(i) == 1){
                sum += mul;
            }
            mul = 2*mul;
        }
        return sum;
    }
}