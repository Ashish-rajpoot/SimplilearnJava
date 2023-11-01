package ThreadDemo;

public class SenterThredDemo extends Thread {
    private String message;
    private SenderDemo senderDemo;

    public SenterThredDemo(String message, SenderDemo senderDemo) {
        this.message = message;
        this.senderDemo = senderDemo;
    }

    @Override
    public void run() {
        synchronized (senderDemo) {
            senderDemo.sendMessage(message);
        }
    }
}
