package org.example;

public enum CustomEnum {
    IT(1,"Information Technology"),
    CS(2,"Computer Science"),
    DSI(3,"Digital Soical Information");
    private int id;
    private String name;
    private CustomEnum(int id, String name){
        this.id  = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "CustomEnum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
