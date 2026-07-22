class PriorityThread extends Thread {

    PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("MAX Priority");
        PriorityThread t2 = new PriorityThread("MIN Priority");
        PriorityThread t3 = new PriorityThread("NORM Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}