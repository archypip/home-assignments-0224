package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterMainWithAtomic {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

        List<Thread> threads = new ArrayList<>();

        for (int k = 0; k < 10000; k++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                atomicInteger.getAndIncrement();
            });
            threads.add(thread);
        }

        for (Thread thread: threads) {
            thread.start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("counter = " + atomicInteger.get());
    }

}