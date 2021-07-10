package secondLink.pessimisticMechanism2;

public class Test4 {
    // они пугают целым Throwable
    public static void main(String[] args) throws Throwable {
        f();
    }
    // хотя мы пугали всего-лишь Exception
    public static void f() throws Exception {
    }
//    wrong
//    public static byte[] (String url) throws IOException {
//        return "<html><body>Nothing! It's stub!</body></html>".getBytes();
}
