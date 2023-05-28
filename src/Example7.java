public interface Example7 {
 interface A{
    int b = 20;
    int fun();
}
 interface B{
    int b = 30;
    int fun(int a);
}
 static class S implements A,B{

    @Override
    public int fun(int a) {
        return a+10;
    }


    @Override
    public int fun() {
        return 50;
    }
}
public static void main(String[] args){
    S ex = new S();
  //  System.out.println(ex.b);
    System.out.println(ex.fun(90));
    System.out.println(ex.fun());
}


}
