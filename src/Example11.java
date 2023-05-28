public class Example11 {
    public static class function implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
        }
    }
    public static class method extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tamil");
                try {
                    Thread.sleep(2);

                } catch (InterruptedException e) {
                  System.out.println("UUUUU");
                }
            }
        }
    }
    public static void main(String[] args) throws  InterruptedException{
        method ex = new method();
        Thread t1 = new Thread(new function());
        t1.start();
        ex.start();
        for(int i=1;i<5;i++){
            System.out.println("abc");
            Thread.sleep(1);
        }
    }
}
