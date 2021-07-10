package firstLink.nestedTryCathFinally9;

public class Test1 {
    public static void main(String[] args) {
        try {
            try {
                try {
//                    ...
                } catch (Exception e) {
                } finally {}
            } catch (Exception e) {
            } finally {}
        } catch (Exception e) {
        } finally {}
    }
}
