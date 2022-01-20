package generics;

import java.beans.Customizer;

// This class can contain an animel of any typ
// our cage can now take in a type of t / type
// it must be of type animal or sub-type to animal
// make animal abstract to prevent instantiation of animal
public class Cage<t extends Animal & Customizer> {
    // it now takes a class of anytype and calls it animal
    // this fixes our casting issue
    private t animal;


    public t getAnimal() {
        return animal;
    }

    public void setAnimal(t animal) {
        this.animal = animal;
    }
}
