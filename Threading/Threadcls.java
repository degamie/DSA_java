//1
package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadcls extends Thread{
    Threading.ThreadMain tm=new Threading.ThreadMain();
    public Thread th=new Thread(tm);
    public ExecutorService executorService=new Executors.newFixedThreadPool(3); 
    }
    public static void main(String[] args){
//Printing Thread's Task 10000's Times
            for(int i=0;i<10000;i++){
        System.out.println("Starting Thread !"+ Threading.ThreadMain.class);

    }

    }
}
//Executing ThreadMain's run() method

//            tm.run();



//    Checking Task execution infinitely
//        for(;;){
//            System.out.println("Starting Thread !");
//        }


