package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);
        arList.add(54);
        arList.add(98);

       // arList.stream().filter(i->i%2==0).forEach(x-> System.out.println(x));
        arList.stream().filter(i->i%2==0).forEach(System.out::println);
        List<Integer> list = arList.stream().filter(i->i%2==0).toList();
        System.out.println(list);

        List<Integer> sqrNum = arList.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(sqrNum);
    }
}
