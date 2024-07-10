package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9,11, 12, 13, 60);
          Stream<Integer> num = numbers.stream()
                  .filter(i-> i < 11)
                  .sorted();


        Numbers.printAndFindLessThanEleven(numbers);

    }
}










