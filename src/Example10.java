public class Example10 {
    public static class person extends Thread{
    public String name;
    public person(String name){ this.name = name ; }
        @Override
        public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Tamil");
            //Thread.sleep(1000);
        }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        person p1 = new person("tamil");
        p1.start();
        for(int i=0;i<5;i++){
            System.out.println("Hello world");
            Thread.sleep(10000);
        }
    }
}
