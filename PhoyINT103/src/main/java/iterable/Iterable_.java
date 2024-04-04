package iterable;

import java.util.Iterator;

public class Iterable_ implements Iterable<Integer> {
    private int[] a;

    public Iterable_() {
        a = new int[]{
                10, 20, 30, 40
        };
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i;

            @Override
            public boolean hasNext() {
                return i < a.length;
            }

            @Override
            public Integer next() {
                return a[i++];
            }
        };
    }
}
