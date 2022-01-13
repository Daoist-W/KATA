import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestGoldilocks {

    @Test
    public void shouldSitAndEat1() throws IOException {
        // list of inputs
        ArrayList<ArrayList<Integer>> inputs2 = ReadFile.getInputs("./src/main/resources/inputs2.txt");

        // function takes in inputs and returns results stored in results
        Goldilocks goldilocks = new Goldilocks();
        ArrayList<Integer> results = goldilocks.getChairs1(inputs2);
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 1, 3, 9, 19, 22);

        assertEquals(expected, results);

    }

    @Test
    public void shouldSitAndEat2() throws IOException {
        // list of inputs
        ArrayList<ArrayList<Integer>> inputs3 = ReadFile.getInputs("./src/main/resources/inputs3.txt");


        // function takes in inputs and returns results stored in results
        Goldilocks goldilocks = new Goldilocks();
        ArrayList<Integer> results = goldilocks.getChairs2(inputs3);
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 1);

        assertEquals(expected, results);

    }


}
