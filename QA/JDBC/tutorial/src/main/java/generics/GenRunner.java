package generics;

public class GenRunner {
    public static void main(String[] args) {
        // make some cages for my specific animals
        Cage kennel = new Cage();
        kennel.setAnimal(new Dog());

        Cage lionCage = new Cage();
        lionCage.setAnimal(new Lion());

        // there is no control over which classes can enter each cage
        kennel.setAnimal(new Lion());

        // To control this we need to use generics
        // generics allow us to specify what type of class a class should be cast to
        // all the way up until runtime

        // this is now a cage that takes in a class of only dog
        // no longer takes in a type of animal, but is more specific
        // this works much like arraylists
        Cage<Dog> kennel2 = new Cage<>();
        kennel2.setAnimal(new Dog());
        kennel2.getAnimal().fetch();

        Cage<Lion> lionCage1 = new Cage<>();
        lionCage1.getAnimal().roar();

        // but there still isn't enough control, as I can still specify something else
        // so we add a restriction to Cage by specifying <k extends Animal>

    }
}
