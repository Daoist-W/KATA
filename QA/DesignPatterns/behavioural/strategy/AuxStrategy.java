public class AuxStrategy implements ConnectionStrategy {

    public void connect(String phone) {
        System.out.println(String.format("Connecting with %s via aux cable...", phone));
        System.out.println("Aux connected.");
    }
}
