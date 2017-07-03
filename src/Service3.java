/**
 * Created by kmaack on 6/30/17.
 */
public class Service3 extends myAbstractServiceThingy implements SuperCoolListener {

    ChoreographEvent event = new ChoreographEvent();

    public Service3(){
    }

    public Service3(ChoreographEvent event){
        this.event = event;
        event.addListener(this);
    }

    @Override
    public void begin() throws InterruptedException {
        try { Thread.sleep((long)(Math.random() * 3000)); }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Existential Depression");
    }

    @Override
    public void start(){
        try { Thread.sleep((long)(Math.random() * 3000)); }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Existential Depression");
    }
}
