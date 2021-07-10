package secondLink.multipleExceptions4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }

    public static void f0() throws EOFException {/*...*/}

    public static void f1() throws FileNotFoundException {/*...*/}
}
