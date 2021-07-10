package secondLink.pessimisticMechanism2;

public class Test1 {
    public static void main(String[] args) throws Exception { // предупреждаем о Exception
        throw new Exception(); // и кидаем Exception
    }

//    wrong

//    public static void main(String[] args) {
//        throw new Exception(); // тут ошибка компиляции

//    public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }
}
