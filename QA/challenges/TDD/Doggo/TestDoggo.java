import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDoggo {

    @Test
    public void shouldMatchArray() {

        ArrayList<String> results = Doggo.placement(69);

        assertEquals(99, results.size());

    }
}
