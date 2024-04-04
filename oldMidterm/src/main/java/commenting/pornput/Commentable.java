package commenting.pornput;

import util.pornput.CommentPlus065;
import util.pornput.Grade065;

import java.util.Collection;
import java.util.Iterator;

// student id: 66130500065
// student name: pornput sooduppatham
public interface Commentable extends Iterable<CommentPlus065> {
    default boolean addComment(String message) {
        return addComment(message, null);
    }

    boolean addComment(String message, Grade065 grade);

    Iterator<CommentPlus065> iterator();

    boolean removeComment(String message);

    Collection<String> extract(Grade065 grade);

    void sort();
}