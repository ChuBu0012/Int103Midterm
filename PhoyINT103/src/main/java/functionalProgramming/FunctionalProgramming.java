package functionalProgramming;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // return only
        Supplier<String> su = () -> "Hello World";

        // รับ parameter only ไม่ return
        Consumer<String> co = (name) -> System.out.println(name);

        // รับ parameter return ด้วย
        Function<String, Integer> fu = (name) -> name.length();

        //  รับ parameter return เป็น boolean
        Predicate<Integer> isEven = (num) -> num % 2 == 0;

        // ประยุกต์ใช้
        List<Integer> ls = new LinkedList<>();
        ls.add(10);
        ls.add(11);
        ls.add(12);
        ls.add(13);

        ls.stream().filter(isEven).forEach(ele -> System.out.println(ele));
    }
}
