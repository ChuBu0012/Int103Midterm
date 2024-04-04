package jcf;

import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();

        // add element
        ls.add("a");
        ls.add("c");
        ls.add(1, "b");
        ls.add("d");

        // remove
        ls.remove("a");
        ls.remove(1);

        System.out.println(ls);

        // keyword search
        // "https://www.geeksforgeeks.org/linked-list-in-java/"


    }
}
