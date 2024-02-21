package Corejava;

public class CloneableObject implements Cloneable {
    private int id;
    private String name;

    public CloneableObject(int i, String alex) {
        this.id = id;
        this.name = alex;
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
        return "CloneableObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableObject co = new CloneableObject(121,"alex");
        CloneableObject co2 = (CloneableObject) co.clone();

        System.out.println(co);
        System.out.println(co2.getName().toLowerCase().substring(0,1));
    }

}
