package extend_;

public class SuperClass {
    private int id;
    private String name;

    public SuperClass(int id, java.lang.String name) {
        this.id = id;
        this.name = name;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof SuperClass that)) return false;
        if (!super.equals(object)) return false;

        if (getId() != that.getId()) return false;
        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{ " +
                "id=" + id +
                ", name='" + name + '\'';
    }
}
