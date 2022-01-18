public class HdmiStrategy implements ConnectionStrategy {

    public void connect(String phone) {
        System.out.println(String.format("Connecting to %s via HDMI audio...", phone));
        System.out.println("HDMI audio connected.");
    }
}
