public class Example2 {

     static class A {
        public  void c() {
            System.out.println("Method in parent class");
        }
    }

    static class D extends A {         // this is single inheritance

        public void c() {
            System.out.println("Method in child class");
        }
    }
    public static void main(String[] args){
       A ex = new D();
        ex.c(); // The ref is of the parent and the new Object is of the child (if the method not present
                // in class D then should it also work bcoz here we are refering the parent obj of it call the
               // parent method when it is not present in child means .


    }
}
