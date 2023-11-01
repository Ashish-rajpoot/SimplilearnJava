package ThreadDemo;

public class SleepWaitDemo {

    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());

        synchronized (LOCK){
            LOCK.wait(3000);
        System.out.println(Thread.currentThread().getName());

        }
    }
}
