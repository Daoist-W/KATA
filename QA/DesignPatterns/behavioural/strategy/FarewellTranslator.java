public class FarewellTranslator {
    // fields
    FarewellStrategy fStrategy;

    // constructors
    public FarewellTranslator() {
    }

    public FarewellTranslator(FarewellStrategy fStrategy) {
        this.fStrategy = fStrategy;
    }

    public void setfStrategy(FarewellStrategy fStrategy) {
        this.fStrategy = fStrategy;
    }

    public void sayFarewell(String name) {
        this.fStrategy.sayFarewell(name);
    }
}
