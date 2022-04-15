package homework.hardworker.netology;

public class Main {
    static OnTaskDoneListener listener = System.out::println;
    static OnTaskErrorListener errorListener = System.out::println;

    public static void main(String[] args) {
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
