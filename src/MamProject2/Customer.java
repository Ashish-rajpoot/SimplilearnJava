package MamProject2;

public class Customer {
    private String name;
    private int numberOfRooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Customer(String name , int numberOfRooms){
        this.name = name;
        this.numberOfRooms= numberOfRooms;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
