public class Main {
    public static void main(String[] args) {
        int size = 10;
        Counter counter = new Counter();

        Thread firstThread = new Thread(new FirstThread(size, counter));
        firstThread.start();

        SecondThread secondThread = new SecondThread(size, counter);
        secondThread.start();
    }
}
