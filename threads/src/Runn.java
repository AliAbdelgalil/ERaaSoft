public class Runn implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable current thread >>>" +Thread.currentThread().getName());
    }
}
