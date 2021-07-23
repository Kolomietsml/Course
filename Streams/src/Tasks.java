import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
//        Задание 1 Stream.
//                Сделать массив int. Из него получить IntStream. Для него
        int[] array = {5, 1, -3, 2, 0, -1, 3, 2, 4, 5};
//        1. Найти среднее значение элементов массива
        double average = IntStream.of(array).average().getAsDouble();
        System.out.println(average);
//        2. Найти минимальный элемент, значение и индекс
        int min = IntStream.of(array).min().getAsInt();
        System.out.println(min);
//        3. Посчитать количество элементов равных нулю
        long count = IntStream.of(array).filter(e -> e == 0).count();
        System.out.println(count);
//        4. Посчитать количество элементов больше нуля
        long count2 = IntStream.of(array).filter(e -> e > 0).count();
        System.out.println(count2);
//        5. Помножить элементы массива на число
        int number = 2;
        IntStream.of(array).map(e -> e * number).forEach(e -> System.out.print(e + " "));

    }
}
