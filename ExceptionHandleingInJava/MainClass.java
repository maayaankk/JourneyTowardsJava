package ExceptionHandleingInJava;

public class MainClass {
    public static void main(String[] args) {
//        try{
//            int a = 2;
//            int b = 0;
//            int c;
//
//            c = a/b;
//            System.out.println(c);
//        }catch (ArithmeticException e) {
//            System.out.println(e.getMessage() + " Occured, please check your code.");
//        }
//        System.out.println("Very important code.");
//        System.out.println("Need to run!!");

        fun1();
    }
    
    static void fun1(){
        int a = 5;
        int b = 0;
        int c;

        c = a/b;
        System.out.println(c);
    }
}
