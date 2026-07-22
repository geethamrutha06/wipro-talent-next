class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 5) {
                System.out.println("Waiting for 5 seconds...");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class NumberThreadDemo {

    public static void main(String[] args) {

        NumberThread t = new NumberThread();
        t.start();
    }
}