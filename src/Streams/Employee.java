package Streams;

public class Employee {
    private int id;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}
