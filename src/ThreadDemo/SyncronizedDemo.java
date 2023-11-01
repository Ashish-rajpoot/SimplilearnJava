package ThreadDemo;

public class SyncronizedDemo {

    public static void main(String[] args) {

        SenderDemo senderDemo = new SenderDemo();
        SenterThredDemo s1 = new SenterThredDemo("hi",senderDemo);
        SenterThredDemo s2 = new SenterThredDemo("Bye",senderDemo);
        s1.start();
        s2.start();
    }
}
