package secondLink.throwsWhithUnckecked3;

public class Test1 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }

//    example
//    public final class Integer extends Number implements Comparable<Integer> {
//    ...
//        /**
//         * ...
//         *
//         * @param s    a {@code String} containing the {@code int}
//         *             representation to be parsed
//         * @return     the integer value represented by the argument in decimal.
//         * @exception  NumberFormatException  if the string does not contain a
//         *               parsable integer.
//         */
//        public static int parseInt(String s) throws NumberFormatException {
//            return parseInt(s,10);
//        }
//    ...
//    }
}
