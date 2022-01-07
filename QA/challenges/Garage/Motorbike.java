    public static class Motorbike extends Vehicle {
        // field
        private int engineCC;

        // constructor
        public Motorbike(String plateNumber) {
            super(plateNumber);
        }

        @Override
        public double calculateCost() {
            return 200;
        }

    }