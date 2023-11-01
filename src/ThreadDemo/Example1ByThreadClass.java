package ThreadDemo;

public class Example1ByThreadClass extends Thread{

    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread());
        Thread thread = new Thread();
        thread.setName("MyThread");
        System.out.println(thread.getName());
        Thread.sleep(5000);
        System.out.println("after 5 send");
        thread.setPriority(MAX_PRIORITY);
    }
}
