package firstLink.tryFinally7;

public class Test5 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }
}

//wrong

//public class App {
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
//
//>> try
//        >> finally
//        >> Exception in thread "main" java.lang.RuntimeException


//public class App {
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
//
//>> COMPILER ERROR: Unrechable statement
