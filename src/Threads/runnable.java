package Threads;


public class runnable implements Runnable {
    private final long countUntil;

    runnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {

        for (int i = 0; i < countUntil; i++) {
            System.out.println("Thread Id " + Thread.currentThread().getId() + " Value " + i);
        }

    }
}