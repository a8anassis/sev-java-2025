package gr.aueb.sev.ch17.threading;

public class Main {

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread(workerThread);
        thread.start();

        System.out.println("Hello from main!");
    }
}
