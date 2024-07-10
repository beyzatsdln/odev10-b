package StreamAPI;

import java.util.List;
import java.util.Optional;

public class Numbers {
    public static void printAndFindLessThanEleven(List<Integer> list){
        list.stream()
                .filter(i -> i < 11)
                .forEach(System.out::println);

        Optional<Integer> greaterOrEqual = list.stream()
                .filter(i -> i >= 11)
                .findFirst();
        if (greaterOrEqual.isPresent()) {
            System.out.println(-1);
    }
}
}
