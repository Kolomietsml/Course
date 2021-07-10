package firstLink.keywords1;

public class Test3 {
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }
}

//wrong
//
//public class App {
//    public static void main(String[] args) {
//        throw new String("Hello!");
//    }
//}
//
//>> COMPILATION ERROR: Incompatible types: required 'java.lang.Throwable', found: 'java.lang.String'

//public class App {
//    public static void main(String[] args) {
//        throw null;
//    }
//}
//
//>> RUNTIME ERROR: Exception in thread "main" java.lang.NullPointerException

//public class App {
//    public static void main(String[] args) {
//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его
//    }
//}
//
//>> RUNTIME ERROR: Exception in thread "main" java.lang.Error

//public class App {
//    public static void main(String[] args) {
//        f(null);
//    }
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }
//}
//
//>> RUNTIME ERROR: Exception in thread "main" java.lang.StackOverflowError
