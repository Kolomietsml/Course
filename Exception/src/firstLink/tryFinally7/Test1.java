package firstLink.tryFinally7;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
}

//wrong

//public class App {
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
//
//>> finally
//        >> Exception in thread "main" java.lang.RuntimeException



