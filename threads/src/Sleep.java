public class Sleep extends Thread {
    @Override
    public void run(){
         sleep();

    }
    private void sleep(){
        try {
            Thread.sleep(52);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int j=0;j<5;j++){
            System.out.println(j+1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
    }

}
