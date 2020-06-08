import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Boy implements Runnable {
    private static final int MAX_NUM_OF_BREAD = 2;
    protected BlockingQueue queue;

    public Boy(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random generator = new Random();
        while(true){
            try {
                Thread.sleep(1000);
                int numOfBread = generator.nextInt(MAX_NUM_OF_BREAD) + 1;
                for(int i = 0; i < numOfBread; i++){
                    int breadUniqueNumber = generator.nextInt(100);
                    queue.put(breadUniqueNumber);
                    System.out.println("Boy throw bread with number: " + breadUniqueNumber);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
