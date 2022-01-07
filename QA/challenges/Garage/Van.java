    public static class Van extends Vehicle {
        // field
        private int storageVolume;

        // constructor
        public Van(String plateNumber) {
            super(plateNumber);
        }

        @Override
        public double calculateCost() {
            return 300;
        }

    }