static Node copyList(Node head) {
  if(head == null)return head;
    Node y=new Node(0);
    Node dummy=y;
    while(head != null){
        Node h=new Node(head.data);
        dummy.next=h;
        dummy=h;
        head=head.next;
    }
    return y.next;
}