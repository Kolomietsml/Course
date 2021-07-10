package firstLink.nestedTryCathFinally9;

public class Test2 {
    public static void main(String[] args) {
        try {
            try {
//                ...
            } catch (Exception e) {
//                ...
            } finally {
//                ...
            }
        } catch (Exception e) {
            try {
//                ...
            } catch (Exception ex) {
//                ...
            } finally {
//                ...
            }
        } finally {
            try {
//                ...
            } catch (Exception e) {
//                ...
            } finally {
//                ...
            }
        }
    }
}
