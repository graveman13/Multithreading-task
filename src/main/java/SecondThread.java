public class SecondThread extends Thread {
    private Counter counter;
    private int size;

    public SecondThread(int size, Counter counter) {
        this.size = size;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < size) {
            counter.increment();
            System.out.println("Second thread counter = " + counter.getCounter());
        }
    }
}

