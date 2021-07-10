package firstLink.tryFinally7;

public class Test2 {
    public static void main(String[] args) {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }
}
