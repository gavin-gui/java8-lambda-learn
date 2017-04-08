import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //BinaryOperator<Integer> add = (x,y) -> x + y;

        //Runnable hello = () -> System.out.println("Hello,world!");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.stream().filter(item -> item % 2 != 0)
                     .map(item->item*2)
                     .forEach(item-> System.out.println(item));
        //long count = stem.count();
        //System.out.println("list count:"+ count);

    }


}
