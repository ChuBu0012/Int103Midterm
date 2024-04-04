package stream;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    // Arrays.stream(arr)
    // All Collection have .stream() method
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        LinkedList<Integer> lsNum = new LinkedList<>();

        // add element
        ls.add("asd");
        ls.add("cvb");
        ls.add(1, "b");
        ls.add("d");

        lsNum.add(1);
        lsNum.add(2);
        lsNum.add(3);
        lsNum.add(4);
        lsNum.add(5);

        // stream ลำธารข้อมูล
        ls.stream().filter((ele) -> ele.length() > 2).forEach(ele -> System.out.println(ele));

        ls.stream()
                .map((ele) -> "(" + ele + ")")
                .forEach(ele -> System.out.println(ele));

        System.out.println(lsNum.stream()
                .reduce(0, (a, b) -> a + b));

        String[] s2 = new String[]{"n", "m", "o", "p"};
//        List<String> ls3 = Arrays.stream(s2).toList();
        List<String> ls3 = Arrays.stream(s2).collect(Collectors.toList());

        ls3.stream().forEach(ele -> System.out.println(ele));
    }
}
