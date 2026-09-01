import java.util.*;

static void mirrorQueue(Queue<String> q) {

    Stack<String> st = new Stack<>();

    int size = q.size();

    for (int i = 0; i < size; i++) {
        String s = q.remove();
        st.push(s);
        q.add(s);
    }

    while (!st.isEmpty()) {
        q.add(st.pop());
    }
}