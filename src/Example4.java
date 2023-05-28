public class Example4 {

     static class Animal{
        public void sleep(){
            System.out.println("sleep");
        }
    }
     static class Dog extends Animal{
        public void eat(){
            System.out.println("eat");
        }
    }
     static class Cat extends Dog{ // multilevel Inheritance
        public void cry() {
            System.out.println("cry");
        }
    }
    public static void main(String[] args){
        Animal ex = new Cat();
        ex.sleep();
        Cat s = new Cat();
        s.eat();
    }
}
