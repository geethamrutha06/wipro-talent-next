class RaceThread extends Thread {

    // Shared variable to indicate whether the race is finished
    static volatile boolean raceFinished = false;

    RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int distance = 1; distance <= 100 && !raceFinished; distance++) {

            System.out.println(getName() + " ran " + distance + " meters");

            // Hare sleeps after reaching 60 meters
            if (getName().equals("Hare") && distance == 60) {
                System.out.println("Hare is sleeping for 1 second...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Small delay so output is visible
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check if this thread won
            if (distance == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n***************************");
                System.out.println(getName() + " WINS THE RACE!");
                System.out.println("***************************");
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Set priorities
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Race Started...\n");

        hare.start();
        tortoise.start();

        try {
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRace Finished.");
    }
}