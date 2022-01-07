public class Runner {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fliesFast();

    }

    public static class Animal {

        // fields
        private String name;
        private int age;
        private double weight;


        // methods
        public void eats() {

        }

        public void breathes() {

        }

        public void moves() {

        }
    }


    public static class Bird extends Animal implements Flies {

        public void fliesFast() {

        }
    }

    public static class Fish extends Animal implements UsesGills {


        public void gills() {

        }
    }

    public static class Dog extends Animal {

    }

    public static class Cat extends Animal {

    }


}
