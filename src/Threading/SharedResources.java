//WID(18/7/2026)(Sarthak Mittal(DegamieSign(Thread Communication)
package Threading;

public class SharedResources {
    private int data;
    private boolean hasdata;

}
public class Producer  extends SharedResources implements Runnable {
  SharedResources resources;
  public Producer(SharedResources resources){this.resources=resources;}
    @Override
    public  synchronized void run(int val){
        while(val){
            try{
                wait();
            }
            catch (InterupttedException e){
                Thread.currentThread().intrupt();
            }
            data=val;
            hasData=true;
            notify();
        }
          return data;
    }

}
public class Consumer  extends SharedResources implements Runnable{
    SharedResources resources;
    public Producer(SharedResources resources){this.resources=resources;}
    @Override
    public  synchronized void run(int val){
        while(!val){
            try{
                wait();
            }
            catch (InterupttedException e){
                Thread.currentThread().intrupt();
            }
            hasData=false;
            notify();
        }
        return data;
    }
}
public class Main {
    public static void main(String[] args){
        SharedResources resources;
        Thread producethread=new Thread(Producer.run());
        Thread consumerthread=new Thread(Producer.run());
        producethread.start();
        consumerthread.start();
}}
