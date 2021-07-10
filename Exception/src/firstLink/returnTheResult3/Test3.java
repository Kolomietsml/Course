package firstLink.returnTheResult3;

public class Test3 {
    public double sqr(double arg) { // надо double
        int k = 1;                  // есть int
        return (double) k;          // явное преобразование int в double
    }
}

//wrong

//public class App {
//    public static double sqr(double arg) {
//        return "hello!";
//    }
//}
//
//>> COMPILATION ERROR: Incompatible types. Required: double. Found: java.lang.
//
//public class App {
//    public static double sqr(double arg) {
//    }
//}
//
//>> COMPILATION ERROR: Missing return statement
//
//public class App {
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//        // а если нечетное, что нам возвращать?
//    }
//}
//
//>> COMPILATION ERROR: Missing return statement
//
//
//public class App {
//    public static void main(String[] args) {
//        double d = sqr(10.0); // ну, и чему равно d?
//        System.out.println(d);
//    }
//    public static double sqr(double arg) {
//        // nothing
//    }
//}
//
//>> COMPILATION ERROR: Missing return statement