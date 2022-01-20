package generics;

import java.beans.Customizer;
import java.beans.PropertyChangeListener;

public class Dog extends Animal implements Customizer {
    public void fetch() {
        System.out.println("fetching");
    }

    public void setObject(Object bean) {

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }
}
