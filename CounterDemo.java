 class Counter {
    private int count;

    public Counter() {};
    public Counter(int initialCount) {
        count = initialCount;
    }

    public void incrementCounter()  { count++; }
    public void decrementCounter()  { count++; }
    public int getCount() { return count; }
    public void resetCounter() { count=0; }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        System.out.println(counter.getCount());
        counter.incrementCounter();
        System.out.println(counter.getCount());
        counter.resetCounter();
        System.out.println(counter.getCount());
    }

}