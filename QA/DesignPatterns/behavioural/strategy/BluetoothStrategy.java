public class BluetoothStrategy implements ConnectionStrategy {

    public void connect(String phone) {
        System.out.println(String.format("Connecting with %s through Bluetooth...", phone));
        System.out.println("Bluetooth connected.");
    }
}
