 class Counter {
    private int count;

    public Counter() {};
    public Counter(int initialCount) {
        count = initialCount;
    }

    public void incrementCounter()  { count++; }
    public void incrementCounter(int step)  { count += step; }

    public void decrementCounter()  { count++; }
    public void decrementCounter(int step)  { count = count-step >= 0 ? count-step :0 ; }

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
        counter.incrementCounter(5);
        System.out.println(counter.getCount());
        counter.incrementCounter(15);
        System.out.println(counter.getCount());
        counter.decrementCounter(25);
        System.out.println(counter.getCount());
    }

}