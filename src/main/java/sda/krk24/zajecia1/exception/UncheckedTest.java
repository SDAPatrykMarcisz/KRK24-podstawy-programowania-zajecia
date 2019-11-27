package sda.krk24.zajecia1.exception;

public class UncheckedTest {
    public static void main(String[] args) {
        UncheckedTest test = new UncheckedTest();
        test.fun1();
//        try{
//            test.fun1();
//        } catch(Exception e){
//            //obsluga
//        }
    }

    private void fun1(){
        fun2();
//        try{
//            fun2();
//        } catch(Exception e){
//            //obsluga
//        }
    }

    private void fun2() {
        fun3();
    }

    private void fun3() {
        throw new UnsupportedOperationException();
    }

}
