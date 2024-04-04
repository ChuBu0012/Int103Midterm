package main;

import commenting.pornput.CommentList065;
import util.pornput.CommentPlus065;
import util.pornput.Grade065;

public class Main {
    public static void main(String[] args) {
        CommentList065 a = new CommentList065();
        a.addComment("asd", Grade065.GOOD);
        a.addComment("cvb", Grade065.AVERAGE);
        a.addComment("jhk", Grade065.POOR);
        a.addComment("bmn", Grade065.NONE);

        for (CommentPlus065 o : a) {
            System.out.println(o);
        }

        a.removeComment("asd");
        System.out.println("remove asd : ");
        for (CommentPlus065 o : a) {
            System.out.println(o);
        }


    }
}
