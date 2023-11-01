package ThreadDemo;

public class Example2ByRunableInterface implements  Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        Thread.sleep(5000);
        System.out.println("after 5 sec");
        Thread.sleep(5000);
        System.out.println("after net 5 sec");
        Thread.currentThread();
        Thread.currentThread();

    }
}
