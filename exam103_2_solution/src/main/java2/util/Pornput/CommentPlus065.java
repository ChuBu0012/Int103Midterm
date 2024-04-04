package util.Pornput;

import java.util.Comparator;
import java.util.function.Predicate;

public class CommentPlus065 extends Comment {
    private final Grade065 grade065;

    public CommentPlus065(String message, Grade065 grade065) {
        super(message.equals(null) ? "NO_COMMENT" : message);
        this.grade065 = grade065.equals(null) ? Grade065.NONE : grade065;
    }

    public static final Comparator<CommentPlus065> GRADE065_COMPARATOR = (o1, o2) -> o1.grade065.compareTo(o2.grade065);

    public static Predicate<CommentPlus065> match065(Grade065 grade) {
        return (thisObj) -> thisObj.grade065.equals(grade);
    }

    @Override
    protected String getContent() {
        return super.getContent() + " " + (this.grade065 == null ? "" : this.grade065);
    }

}
