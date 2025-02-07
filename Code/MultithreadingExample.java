

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);

            try {
               
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }

        System.out.println(name + " completes its execution.");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        
        System.out.println("Main thread completes its execution.");
    }
}