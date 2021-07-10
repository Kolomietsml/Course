package secondLink.orCathOrThrows5;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }
}

//wrong

//public class App {
//    public static void main(String[] args) {
//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }
//    }
//}
//
//>> COMPILATION ERROR: unhandled exception: java.lang.Throwable

//public class App {
//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }
//    }
//}
//
//>> COMPILATION ERROR: unhandled exception: java.lang.Exception
