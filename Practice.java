import java.util.*;

class Practice {

    static void addAtBottom(Stack<Integer> st, int x) {
        // base case
        if (st.isEmpty()) {
            st.add(x);
            return;
        }
        int top = st.pop();
        addAtBottom(st, x);
        st.add(top);
    }

    static void revUsingRec(Stack<Integer> st) {
        // base case
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        revUsingRec(st);
        addAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // add a element
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        System.out.println(st);
        revUsingRec(st);
        System.out.println(st);
    }
}

