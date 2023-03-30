import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {

    public void randomNumberList(){
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i=0; i<10; i++) {
            numbers.add(Math.random());
        }
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
