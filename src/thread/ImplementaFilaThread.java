package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementaFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjectFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjectFilaThread>();

    public static void add(ObjectFilaThread objectFilaThread) {
        pilha_fila.add(objectFilaThread);
    }

    @Override
    public void run() {
        Iterator iterator = pilha_fila.iterator();

        synchronized (iterator) {
            while (iterator.hasNext()) {
                ObjectFilaThread processar = (ObjectFilaThread) iterator.next();
                iterator.remove();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        super.run();
    }
    public synchronized void start() {
        this.start();
    }
}


