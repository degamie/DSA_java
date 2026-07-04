//1
package Threading;

public class Threadcls extends Thread{
    ThreadMain tm=new ThreadMain();
    public Thread th=new Thread



        (tm);
    public static void main(String[] args){
//Printing Thread's Task 10000's Times
            for(int i=0;i<10000;i++){
        System.out.println("Starting Thread !"+ThreadMain.class);

    }

    }
}
//Executing ThreadMain's run() method

//            tm.run();



//    Checking Task execution infinitely
//        for(;;){
//            System.out.println("Starting Thread !");
//        }


