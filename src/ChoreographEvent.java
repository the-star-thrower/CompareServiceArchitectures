import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by kmaack on 6/30/17.
 */
public class ChoreographEvent {

    private List<SuperCoolListener> listeners = new ArrayList<SuperCoolListener>();

    ExecutorService es = Executors.newCachedThreadPool();

    public void ohShitWaddup() throws InterruptedException {
        System.out.println("Oh Shit Waddup!");

        /* notify all listeners */
        for (SuperCoolListener l : listeners){
            es.execute(new Thread(() -> {
                try {
                    l.begin();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            })); }
            es.shutdown();

        /* terminate if all tasks have not completed after 8 seconds */
        es.awaitTermination(8, TimeUnit.SECONDS);
    }

    /* subscribe a listener to this event */
    public void addListener(SuperCoolListener addMe){
        listeners.add(addMe);
    }
}
