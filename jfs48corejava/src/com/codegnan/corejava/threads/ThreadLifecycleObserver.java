package com.codegnan.corejava.threads;

public class ThreadLifecycleObserver {

    /**
     * A simple sleeping task used as the thread body.
     */
    private static class SleepingTask implements Runnable {

        @Override
        public void run() {
            System.out.println("  [Task] Thread entered RUNNABLE state");

            try {
                System.out.println("  [Task] Going to TIMED_WAITING (sleep 2 s)");
                Thread.sleep(2000);
                System.out.println("  [Task] Woke up, back in RUNNABLE");
            } catch (InterruptedException e) {
                System.out.println("  [Task] Interrupted during sleep");
                Thread.currentThread().interrupt();
            }

            System.out.println("  [Task] run() finishing ? will become TERMINATED");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(new SleepingTask(), "LifecycleWorker");

        System.out.println("State 1 — NEW:             " + worker.getState());

        worker.start();

        // Give the thread a moment to enter sleep
        Thread.sleep(100);
        System.out.println("State 2 — TIMED_WAITING:   " + worker.getState());

        // Wait for it to finish
        worker.join();
        System.out.println("State 3 — TERMINATED:      " + worker.getState());

        System.out.println("\nLifecycle observation complete.");
    }
}