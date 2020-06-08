import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    private static final int NUM_OF_SWANS = 4;

    public static void main(String[] args){
        BlockingQueue queue = new ArrayBlockingQueue(5);

        Boy producer = new Boy(queue);
        new Thread(producer).start();

        Swan[] consumers = new Swan[NUM_OF_SWANS];
        for(int i = 0; i < NUM_OF_SWANS; i++){
            consumers[i] = new Swan(i, queue);
            new Thread(consumers[i]).start();
        }
    }
}
