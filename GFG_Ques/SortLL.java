package GFG_Ques;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
class SortLL {
    public Node segregate(Node head) {
        Node hh=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(hh!=null){
            list.add(hh.data);
            hh=hh.next;
        }
        Collections.sort(list);
        Node gg=new Node(list.get(0));
        Node rev=gg;
        for(int i=1; i<list.size(); i++){
            Node ff=new Node(list.get(i));
            rev.next=ff;
            rev=ff;
        }
        return gg;
    }
}