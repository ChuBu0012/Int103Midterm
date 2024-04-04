package commenting.Pornput;

import util.Pornput.CommentPlus065;
import util.Pornput.Grade065;

import java.util.Collection;
import java.util.Iterator;

public interface Commentable extends Iterable<CommentPlus065> {
    default boolean addComment(String message) {
        return addComment(message, null);
    }

    boolean addComment(String message, Grade065 grade);

    boolean removeComment(String message);

    Iterator<CommentPlus065> iterator();

    Collection<String> extract(Grade065 grade);

    void sort();
}