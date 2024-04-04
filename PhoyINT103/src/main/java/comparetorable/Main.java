package comparetorable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparable_[] c = new Comparable_[]{
                new Comparable_(1, "a"),
                new Comparable_(2, "b"),
                new Comparable_(3, "c")
        };
        for (Comparable_ cu : c) {
            System.out.println(cu);
        }
        System.out.println();
        Arrays.sort(c);
        for (Comparable_ cu : c) {
            System.out.println(cu);
        }

        Comparator<Comparable_> c2 = new Comparator<Comparable_>() {
            @Override
            public int compare(Comparable_ o1, Comparable_ o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println();
        Arrays.sort(c, c2);
        for (Comparable_ cu : c) {
            System.out.println(cu);
        }

    }
}
