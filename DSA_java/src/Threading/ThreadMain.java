package Threading;
public class ThreadMain implements Runnable {
    Threadcls t1=new Threadcls();
    Thread t=new Thread(t1);
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}


    //public class ThreadMain implements Runnable {







//        Threadcls tc=new Threadcls();
//        Thread thread=new Thread(tc);
//        thread.start();

