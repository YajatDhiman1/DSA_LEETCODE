class Solution {
    Node deleteNode(Node head, int x) {
        if(x == 1)return head.next;
        int a=1;
        Node curr=head;
        Node prev=null;
        while(curr != null){
            if(a == x){
                prev.next = curr.next;
                curr.next = null;
            }
            prev=curr;
            curr=curr.next;
            a++;
        }
        return head;
    }
}