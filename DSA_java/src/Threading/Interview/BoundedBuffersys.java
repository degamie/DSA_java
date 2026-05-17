//WID(Sarthak Mittal)(DegamieISign)(Sys's Design(interview(q_ans))
package Threading.Interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffersys <T>{
    int capacity=0;
    public BoundedBuffersys(int capacity){
        this.capacity=capacity;
    }
    public final Queue<T> queue=new LinkedList<>();
    public final Lock lock=new ReentrantLock();//Prevents From Starvation and  handles db's Thread Scheduling Exceptional events  in Sys
    public final Condition isEmpty=new lock.newCondition();
    public final Condition isFull=new lock.newCondition();
}
