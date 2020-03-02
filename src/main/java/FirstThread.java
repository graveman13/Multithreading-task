public class FirstThread implements Runnable {
    private Counter counter;
    private int size;

    public FirstThread(int size, Counter counter) {
        this.size = size;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < size) {
            counter.increment();
            System.out.println("First thread counter = " + counter.getCounter());
        }
    }
}
