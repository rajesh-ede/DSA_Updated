package Stack;
import java.util.Queue;
import java.util.Stack;
public class QueueUsingSt {
    static class Queue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void enqueue(int x) {
            while (!st1.empty()) {
                st2.push(st1.peek());
                st1.pop();
            }
            st2.push(x);
            while (!st2.empty()) {
                st1.push(st2.peek());
                st2.pop();
            }
        }

        int dequeue() {
            if (st1.empty()) {
                return -1;
            }
            int x = st1.peek();
            st1.pop();
            return x;
        }
    }
    public static void main(String[] args) {
        Queue qe = new Queue();
        qe.enqueue(1);
        qe.enqueue(2);
        qe.enqueue(3);
        qe.enqueue(4);
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());

    }
}
