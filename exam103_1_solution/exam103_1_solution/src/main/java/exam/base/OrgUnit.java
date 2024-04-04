package exam.base;

public abstract class OrgUnit implements Loggable{
    public final int code;
    private String name;
    protected String logging;

    public OrgUnit(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLog(){
        return  this.logging;
    };

    public void clearLog(){
        this.logging = "";
    }
}
