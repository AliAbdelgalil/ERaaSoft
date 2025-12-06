
    public class Joiin extends Thread {
        @Override
        public void run(){
            App();

        }
        private void App() {
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 0; j < 5; j++) {
                System.out.println(j + 1);
            }
        }        }
