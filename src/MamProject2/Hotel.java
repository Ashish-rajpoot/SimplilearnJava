package MamProject2;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<String> customerName = new ArrayList<>();
    private int roomsBooked;

    public Hotel() {

    }

    public Hotel(List<String> customerName, int roomsBooked) {
        this.customerName = customerName;
        this.roomsBooked = roomsBooked;
    }

    public List<String> getCustomerName() {
        return customerName;
    }

    public void setCustomerName(List<String> customerName) {
        this.customerName = customerName;
    }

    public int getRoomsBooked() {
        return roomsBooked;
    }

    public void setRoomsBooked(int roomsBooked) {
        this.roomsBooked = roomsBooked;
    }

    public String checkIn(Customer customer) {

        if (this.getRoomsBooked() > 10 || this.getRoomsBooked() + customer.getNumberOfRooms() > 10) {
            return "No Rooms available";
        }
        customerName.add(customer.getName());
        roomsBooked += customer.getNumberOfRooms();
        return "Checked in";
    }

    public String checkRooms(Customer customer) {
        if(this.getRoomsBooked()+customer.getNumberOfRooms()<=10){
            return "No";
        }else {
            return "Yes";
        }
    }
}
