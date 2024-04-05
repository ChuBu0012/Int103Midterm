package generictype;

import java.util.Arrays;

public class Container<T> {
    private T[] arr;
    private int size;

    public Container(){
        arr = (T[]) new Object[1];
    }

    public boolean append(T ele){
        if(ele == null) return false;
        arr = Arrays.copyOf(arr,arr.length + 1);
        arr[size++] = ele;
        return true;
    }

    public T getEleByIndex(int i){
        if(i < 0 || i >= arr.length) return null; // Fixed condition
        return arr[i];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container<?> container = (Container<?>) o;
        return Arrays.equals(arr, container.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return "Container{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
