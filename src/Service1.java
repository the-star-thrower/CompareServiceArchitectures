/**
 * Created by kmaack on 6/30/17.
 */
public class Service1 extends myAbstractServiceThingy implements SuperCoolListener{

    ChoreographEvent event = new ChoreographEvent();

    public Service1(){
    }

    public Service1(ChoreographEvent event){
        this.event = event;
        event.addListener(this);
    }

    @Override
    public void begin() throws InterruptedException {
        try { Thread.sleep((long)(Math.random() * 3000)); }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Here come dat boi!");
    }

    @Override
    public void start(){
        try { Thread.sleep((long)(Math.random() * 3000)); }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Here come dat boi!");
    }

}
