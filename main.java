import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Напишите программу, которая использует Stream API для
 * обработки списка чисел.
 * Программа должна вывести на экран среднее значение
 * всех четных чисел в списке.
 */
public class main {
    public static void main(String[] args) {

        List<? extends Number> list = Arrays.asList(1.0, 2, 3, 4, 4.7, 4);
        System.out.println("Среднее значение всех четных чисел в списке: " + averageEvenNumbers(list));
    }

    public static <T extends Number> Double averageEvenNumbers(List<T> numbers){
        return numbers.stream().mapToDouble(Number::doubleValue).filter(numb->numb%2==0).average().orElse(0);
    }
}
