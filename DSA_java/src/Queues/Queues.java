//WID(26/6/2026)(Sarthak Mittal(DegamieSign(Queue's Implmentation Using Stacks(Core Java))
package DSA_java.src;

import org.w3c.dom.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues<T> {
    int val = 0;
    Stack st1;
    Stack st2;
    int size;
    public void isEmpty() {
        if (st1.isEmpty()) st1.isEmpty();
        else if (st1.isEmpty()) System.out.println(st2.isEmpty());
    }

    public void peek() {
        if (st1.isEmpty()) st1.peek();
        else if (st1.isEmpty()) st1.peek();
        else isEmpty();
    }

    public void enqueu(int val) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(val);

        while (st2.isEmpty()) {
            st1.push(st2.pop());
        }
        st2.push(val);

    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        q1.offer(6);
        System.out.println(q1);
        Deque<Integer> deque = new LinkedList<>();
        deque.remove(q1.add(1));
        System.out.println(deque);
        System.out.println(q1.stream().sorted());


    }

}
