package generictype;

public class Main {
    public static void main(String[] args) {
        Container<Person> c  = new Container<>();
        c.append(new Person(1,"Most"));
        System.out.println(c);
    }
}
