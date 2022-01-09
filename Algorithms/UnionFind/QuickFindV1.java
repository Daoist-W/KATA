import java.util.ArrayList;
import java.util.Arrays;

public class QuickFindV1 {

    public static void quickFind (ArrayList<int[]> pq, int N) {

        // generating an array of length N, where connections will be stored
        int[] connections = new int[N];
        // populating these elements with their index values
        for(int i = 0; i < N; i++) {
            connections[i] = i;
        }

        // core algorithm logic is here
        for(int i = 0; i < pq.size(); i++) {
            int p = pq.get(i)[0];
            int q = pq.get(i)[1];

            // condition ID 2->3->5
            if (connections[p] != connections[q]) {
                for (int t = connections[p], j = 0; j < N; j++) {
                    if (connections[j] == t) {
                        connections[j] = connections[q];
                    }
                }
            }

            System.out.println(Arrays.toString(pq.get(i)) + " " + Arrays.toString(connections));
        }
    }
}