package commenting.Pornput;

import util.Pornput.CommentPlus065;

import java.util.Iterator;
import java.util.StringJoiner;

public interface CommentablePlus065 extends Commentable {
    default String inspect065() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Iterator<CommentPlus065> it = this.iterator();
        while (it.hasNext()) {
            sj.add(it.next().toString());
        }
        return sj.toString();
    }
}
