package commenting.Pornput;

import util.Pornput.CommentPlus065;
import util.Pornput.Grade065;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CommentList065 implements CommentablePlus065 {
    private final LinkedList<CommentPlus065> comments065 = new LinkedList<>();

    @Override
    public boolean addComment(String message, Grade065 grade) {
        if (message == null) return false;
        return comments065.add(new CommentPlus065(message, grade));
    }

    @Override
    public boolean removeComment(String message) {
        if (message == null) return false;
        Iterator<CommentPlus065> it = iterator();
        while (it.hasNext()) {
            if (it.next().equals(new CommentPlus065(message, null))) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<CommentPlus065> iterator() {
        return comments065.iterator();
    }

    @Override
    public Collection<String> extract(Grade065 grade) {
        Collection<String> extractedComments = new LinkedList<>();

        for (CommentPlus065 comment : comments065) {
            if (CommentPlus065.match065(grade).test(comment)) {
                extractedComments.add(comment.toString());
            }
        }
        ;
        return extractedComments;
    }

    @Override
    public void sort() {
        comments065.sort(CommentPlus065.GRADE065_COMPARATOR);
    }
}
