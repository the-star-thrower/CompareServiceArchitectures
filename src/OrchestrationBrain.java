import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kmaack on 6/30/17.
 */
public class OrchestrationBrain<T> {
    ExecutorService es = Executors.newCachedThreadPool();
    List<myAbstractServiceThingy> list = new ArrayList<myAbstractServiceThingy>();

    public void initalizeServices(myAbstractServiceThingy ... t){
        for (myAbstractServiceThingy thing : t){
            list.add(thing);
        }
    }

    public void ohShitWaddup() throws InterruptedException {
        System.out.println("Oh Shit Waddup");
        for (myAbstractServiceThingy thing : list){
            es.execute(new Thread(() -> {
                    thing.start();
            })); }
        es.shutdown();
        }
    }
