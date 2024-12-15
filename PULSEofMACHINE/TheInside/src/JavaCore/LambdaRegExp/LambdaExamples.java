package JavaCore.LambdaRegExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Создаем параллельный поток
        numbers.parallelStream()
                .filter(n -> {
                    // Выводим номер потока для наблюдения
                    System.out.println("Filtering: " + n + " in Thread: " + Thread.currentThread().getName());
                    return n % 2 == 0; // Фильтруем четные числа
                })
                .map(n -> {
                    // Преобразуем четные числа, умножая их на 2
                    System.out.println("Mapping: " + n + " in Thread: " + Thread.currentThread().getName());
                    return n * 2;
                })
                .forEach(result -> System.out.println("Result: " + result + " in Thread: " + Thread.currentThread().getName()));
    }

    }



