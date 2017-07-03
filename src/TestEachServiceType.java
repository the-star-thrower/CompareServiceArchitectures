/**
 * Created by kmaack on 6/30/17.
 */
public class TestEachServiceType {

    ChoreographEvent choreograph = new ChoreographEvent();
    OrchestrationBrain brain = new OrchestrationBrain();

    private void runChoreographedSequence() throws InterruptedException {
        Service1 myFirstCoolService = new Service1(choreograph);
        Service2 mySecondCoolService = new Service2(choreograph);
        Service3 myThirdCoolService = new Service3(choreograph);

        System.out.println("Running Choreographed sequence.");
        /*choreograph.ohShitWaddup();*/
        choreograph.ohShitWaddup();
        }

    private void runOrchestratedSequence() throws InterruptedException {
        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        Service3 service3 = new Service3();
        System.out.println("Running Orchestrated Sequence");
        brain.initalizeServices(service1, service2, service3);
        brain.ohShitWaddup();
    }

    public static void main(String[] args) throws InterruptedException {
        TestEachServiceType test = new TestEachServiceType();
        test.runChoreographedSequence();
        System.out.println("\n");
        test.runOrchestratedSequence();
    }
}
