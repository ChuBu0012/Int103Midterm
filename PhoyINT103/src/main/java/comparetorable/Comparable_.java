package comparetorable;

public class Comparable_ implements Comparable<Comparable_> {

    private int id;
    private String name;

    public Comparable_(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Comparable_ o) {
        return o.id - this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comparable_{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
