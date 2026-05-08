//WID(8/5/2026)(Sarthak Mittal)(DegamieSIgn)#1
package Threading.Runnable;

import Threading.Threadcls;

public class Runnablecls extends Thread implements  Runnable {
    @Override
    public void run() {
        System.out.println("Thread's Runnable Interface");
    }
    public static void main(String[] args){
        Runnablecls runnable=new Runnablecls();
        runnable.run();

    }

}


