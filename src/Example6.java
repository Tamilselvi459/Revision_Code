public class Example6 {
     interface inA{
        int a = 10; // by default it is public , static , final
        void funct(); // all methods are abstract by default
    }
     static class example implements inA{

        @Override
        public void funct() {
            System.out.println("funct method");
        }
    }
    public static void main(String[]args){
        example A = new example();
        A.funct();
        System.out.println(A.a);
    }
}
