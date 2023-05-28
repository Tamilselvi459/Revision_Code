public class Example9 {
    public static void main(String[]args){
        try{
            int a = 5/0;


        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("exception");
        } finally{
            System.out.println("finally block");
        }
        System.out.println("last line");
    }
}
