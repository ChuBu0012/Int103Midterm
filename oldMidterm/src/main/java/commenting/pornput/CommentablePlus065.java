package commenting.pornput;

import java.util.Iterator;
import java.util.StringJoiner;

public interface CommentablePlus065 extends Commentable {
    default String inspect065() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Iterator it = iterator();
        while (it.hasNext()) {
            sj.add(it.next().toString());
        }
        return sj.toString();
    }
}
