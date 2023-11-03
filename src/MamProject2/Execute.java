package MamProject2;

public class Execute {
    public static void main(String[] args) {
        Customer customer = new Customer("DoSelect",11);
        Hotel hotel = new Hotel();
        String val = hotel.checkIn(customer);
        System.out.println(val);
    }
}
