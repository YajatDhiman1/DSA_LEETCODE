import java.util.*;
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> gg=new ArrayList<>();
        ListNode temp=head;
        while(temp != null){
            gg.add(temp.val);
            temp=temp.next;
        }
        
        Collections.sort(gg);
        ListNode dummy=new ListNode(gg.get(0));
        ListNode curr=dummy;
        for(int k=1; k<gg.size(); k++){
            ListNode gj = new ListNode(gg.get(k));
            curr.next=gj;
            curr=curr.next;
        }
        return dummy;
    }
}