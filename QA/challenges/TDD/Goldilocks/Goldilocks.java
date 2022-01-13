import java.util.ArrayList;

public class Goldilocks {
    // fields
    private int weight;
    private int maxPorridgeTemp;
    private int maxLuminosity;
    ArrayList<Integer> chairs = new ArrayList<>();


    public Goldilocks() {
    }

    public ArrayList<Integer> getChairs1(ArrayList<ArrayList<Integer>> inputs) {
        this.weight = inputs.get(0).get(0);
        this.maxPorridgeTemp = inputs.get(0).get(1);

        // creating instance of chair and porridge
        Chair chair;
        Porridge porridge;

        // loop through chairs
        for (int i = 1; i < inputs.size(); i++) {
            chair = new Chair(inputs.get(i).get(0));
            porridge = new Porridge(inputs.get(i).get(1));

            if (this.weight < chair.getMaxWeight() &&
                    this.maxPorridgeTemp >= porridge.getTemperature()
            ) {
                chairs.add(i);
            }
        }
        return this.chairs;
    }

    public ArrayList<Integer> getChairs2(ArrayList<ArrayList<Integer>> inputs) {
        this.weight = inputs.get(0).get(0);
        this.maxPorridgeTemp = inputs.get(0).get(1);
        this.maxLuminosity = inputs.get(0).get(2);

        // creating instance of chair and porridge
        Chair chair;
        Light light;
        Porridge porridge;

        // loop through chairs
        for (int i = 1; i < inputs.size(); i++) {
            chair = new Chair(inputs.get(i).get(0));
            porridge = new Porridge(inputs.get(i).get(1));
            light = new Light(inputs.get(i).get(2));

            if (this.weight < chair.getMaxWeight() &&
                    this.maxPorridgeTemp >= porridge.getTemperature() &&
                    this.maxLuminosity >= light.getLuminosity()
            ) {
                chairs.add(i);
            }
        }
        return this.chairs;
    }
}
