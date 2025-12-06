
public class Main {
    public static void main(String[] args){

        //extends thread
        Simple simple = new Simple();
        simple.start();
        //Runnable implementation
        Thread thread = new Thread(new Runn());
        thread.start();
        //Thread.sleep()
        Sleep sleep = new Sleep();
        sleep.start();

        //Thread.join()
        Joiin joiin = new Joiin();
        joiin.start();
        try {
            joiin.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            sleep.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //main thread massage
        System.out.println("Hello World from Main thread");





    }
}