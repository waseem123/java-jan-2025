class MyRunnableThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        MyRunnableThread mr1 = new MyRunnableThread();
        MyRunnableThread mr2 = new MyRunnableThread();
        MyRunnableThread mr3 = new MyRunnableThread();

        Thread t1 = new Thread(mr1, "THREAD X");
        Thread t2 = new Thread(mr2, "THREAD Y");
        Thread t3 = new Thread(mr3, "THREAD Z");

        try {
            t1.start();
            // t1.join(); // t1.join() is a non-static method
            t2.start();
            // t1.sleep(10000); // Thread.sleep() is a static method
            t3.start(); // IllegalThreadStateException

            t1.setPriority(1);
            t2.setPriority(10);
            t3.setPriority(7);
            
        } catch (IllegalThreadStateException e) {
            System.out.println("---------------------" + e.getMessage());
        } catch (Exception e) {
        }
    }
}
