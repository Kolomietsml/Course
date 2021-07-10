package firstLink.tryCatchCatch6;

public class Test1 {
    public static void main(String[] args) {
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
}

//wrong

//public class App {
//    public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }
//}
//
//>> COMPILATION ERROR: Exception 'java.lang.RuntimeException' has alredy been caught
