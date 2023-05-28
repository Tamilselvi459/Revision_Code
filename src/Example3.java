public class Example3 {
    int a;
    int b;
    public Example3(){
        System.out.println("1 constructor");
    }
    public void fun(){
        System.out.println("fun in parent class");
    }
    public static class xyz extends Example3{
        public xyz(){
            super();
            System.out.println("2 constructor"); // constructor with calling the super
                                                 // class and the method inside it

           fun();

        }
    }
    public static void main(String[] args){

        xyz ex = new xyz();
    }
}
