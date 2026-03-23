import java.util.*;
class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
  }
}

class Solution {
  public boolean isPalindrome(Node head) {
    Stack<Integer> stk=new Stack<>();
    Node temp=head;
        
    while(temp != null){
      stk.push(temp.data);
      temp=temp.next;
    }
    temp = head;
        
    while(temp != null){
      if(temp.data != stk.pop()){
        return false;
      }
      temp=temp.next;
    }
    return true;
  }
}