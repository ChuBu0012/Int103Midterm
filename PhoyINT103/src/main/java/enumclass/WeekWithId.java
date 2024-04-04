package enumclass;

public enum WeekWithId {
    MONDAY(1, "MONDAY"),
    TUESDAY(2, "TUESDAY"),
    WEDNESDAY(3, "WEDNESDAY"),
    THURSDAY(4, "THURSDAY"),
    FRIDAY(5, "FRIDAY"),
    SATURDAY(6, "SATURDAY"),
    SUNDAY(7, "SUNDAY");
    private int id;
    private String name;

    WeekWithId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
