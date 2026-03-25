package GFG_Ques;

import java.util.Stack;

public class reverseStack {
  public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> stktwo = new Stack<>();
        while(!st.isEmpty()){
            stk.push(st.pop());
        }
        while(!stk.isEmpty()){
            stktwo.push(stk.pop());
        }
        while(!stktwo.isEmpty()){
            st.push(stktwo.pop());
        }
        
    }
}
