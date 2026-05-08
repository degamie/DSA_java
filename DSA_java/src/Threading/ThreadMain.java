package Threading;

public class ThreadMain {
    public static void main(){
        Threadcls tc=new Threadcls();
        Thread thread=new Thread(tc);
        thread.start();

    }


}
