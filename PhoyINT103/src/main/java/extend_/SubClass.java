package extend_;

public class SubClass extends SuperClass{
    private String someThing;
    public SubClass(int id, String name){
        super(id,name);
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+ this.someThing + " }";
    }
}
