public class Example5 {

    public static class A{
        public void funA(){
            System.out.println("A");
        }
    }
    public static class B extends A{
        public void funB(){
            System.out.println("B");
        }
    }
    public static class C extends A{ // Hierachical Inheriance
        public void funC(){
            System.out.println("C");
        }
    }
    public static void main(String[] args){
        B ex = new B();
        ex.funB();
        A exx = new C();
        exx.funA();
    }

}
