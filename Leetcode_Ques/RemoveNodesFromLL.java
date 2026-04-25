import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stk=new Stack<>();
        ListNode gg=head;
        while(gg != null){
            stk.push(gg.val);
            gg=gg.next;
        }
        ListNode dummy=null;
        int max=0;
        while(!stk.isEmpty()){
            if(stk.peek() >= max){
                max=stk.peek();
                ListNode rr=new ListNode(max);
                rr.next=dummy;
                dummy=rr;
            }
            stk.pop();
        }
        return dummy;
    }
} {
  
}
