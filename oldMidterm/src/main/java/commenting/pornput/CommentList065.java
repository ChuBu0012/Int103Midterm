package commenting.pornput;

import util.pornput.CommentPlus065;
import util.pornput.Grade065;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommentList065 implements CommentablePlus065 {
    private final LinkedList<CommentPlus065> comments065;

    public CommentList065() {
        comments065 = new LinkedList<>();
    }

    @Override
    public boolean addComment(String message, Grade065 grade) {
        if (message == null || grade == null) return false;
        return comments065.add(new CommentPlus065(message, grade));
    }

    @Override
    public Iterator<CommentPlus065> iterator() {
        return comments065.iterator();
    }

    @Override
    public boolean removeComment(String message) {
//        Iterator<CommentPlus065> it = iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(new CommentPlus065(message, null))) {
//                it.remove();
//                return true;
//            }
//        }
        comments065.remove(new CommentPlus065(message, null));
        return true;
    }

    @Override
    public Collection<String> extract(Grade065 grade) {
        Collection<String> extract = new LinkedList<>();

        for (CommentPlus065 comment : comments065){
            if(CommentPlus065.match065(grade).test(comment)){
                extract.add(comment.toString());
            }
        }
        return extract;
    }


    @Override
    public void sort() {
        comments065.sort(CommentPlus065.GRADE065_COMPARATOR);
    }
}
