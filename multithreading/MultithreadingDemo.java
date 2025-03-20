class DemoThread extends Thread {
    String threadName;

    public DemoThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(threadName + " - " + i);
        }
    }
}

class MultiThreadingDemo {
    public static void main(String[] args) {
        try {
            DemoThread t1 = new DemoThread("THREAD 1");
            t1.start();
            DemoThread t2 = new DemoThread("THREAD 2");
            t2.start();
            DemoThread t3 = new DemoThread("THREAD 3");
            t3.start();

            t1.start(); // IllegalThreadStateException
        }catch (IllegalThreadStateException e) {
            System.out.println("---------------------"+e.getMessage());
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}

// There are two ways to create a thread in Java:
// 1. By extending Thread class
// 2. By implementing Runnable interface

// Thread class provides constructors and methods to create and perform
// operations on a thread.
// We use run() method to perform operations on a thread.
// We use start() method to start a thread.