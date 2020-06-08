import java.util.concurrent.BlockingQueue;

public class Swan implements Runnable {
    protected BlockingQueue queue;
    private long id;

    public Swan(long id, BlockingQueue queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
                System.out.println("Swan number: " + this.id + " took bread with number: " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
