import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //BinaryOperator<Integer> add = (x,y) -> x + y;

        //Runnable hello = () -> System.out.println("Hello,world!");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stem = list.stream().filter(item -> item % 2 != 0);
        //long count = stem.count();
        //System.out.println("list count:"+ count);

        stem.map(item -> item * 2).forEach(item -> System.out.println(item));
    }


}
