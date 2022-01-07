    public static class Car extends Vehicle {
        // field
        private String carType;
        private boolean isAutomatic;
        private int horsePower;

        // constructor
        public Car(String plateNumber) {
            super(plateNumber);
        }

        @Override
        public double calculateCost() {
            return 100;
        }

    }