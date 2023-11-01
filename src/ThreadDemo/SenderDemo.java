package ThreadDemo;

public class SenderDemo {

    public void sendMessage(String message)  {
        System.out.println(message + "\t sending");
        try {
            Thread.sleep(3000);
        System.out.println(message + "\t sent");
            Thread.sleep(3000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
