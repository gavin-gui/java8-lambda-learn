import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //BinaryOperator<Integer> add = (x,y) -> x + y;

        //Runnable hello = () -> System.out.println("Hello,world!");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> result = list.stream() //list转化为stream
                .filter(item -> item % 2 != 0) //使用filter过滤出符合条件的数据
                .map(item -> item * 2) //使用map处理每一项数值
                //.forEach(item-> System.out.println(item))
                .collect(Collectors.toList()); //将stream转化为list
        System.out.println(result);
        //long count = stem.count();
        //System.out.println("list count:"+ count);

    }


}
