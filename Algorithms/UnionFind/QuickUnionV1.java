import java.util.ArrayList;
import java.util.Arrays;

public class QuickUnionV1 {

    // given a set or union pairs and a holding array of length N
    // we will populate the array with their index numbers
    // for this algorithm, information contained within the element states which element they point to
    // this is different from quickFind where we were only concerned with whether or not the elements held the same value (this implied connection)
    // we thus had to cycle through the entire array each iteration, checking and updating connections
    // by focusing on references, an element that points to itself is implicitly a node
    // assuming this saves us computational steps

    public static void quickUnion(ArrayList<int[]> unionSet, int N) {
        // creating array for connections 
        int[] connections = new int[N];
        for (int i = 0; i < N; i++) {
            connections[i] = i;
        }

        // the core algorithm logic is below 
        for(int[] pq : unionSet) {
            int p = pq[0];
            int q = pq[1];

            while(connections[p] != connections[q]){
                if(q == connections[q]) { // this checks if the element q refers to itself (if it is a node element)
                    connections[p] = q; // if node element, assign connection to element at p
                } else {
                    q = connections[q]; // if element is not node, move one step up tree, repeat check
                }
            }
            System.out.println(Arrays.toString(pq) + " " + Arrays.toString(connections));
        }
    }
}

// below is the more compact, ideal solution, but for clarity of intention I have left the above code
/*

    // for (initializationStatement; testExpression; updateStatement)
    // {
    //    // statements inside the body of loop
    // }

    for(int i = p; i != id[i]; i = id[i]) {
        for(int j = q; j != id[j]; j = id[j]) {
            i == j ? id[i] = j : continue;
        }
        System.out.println(Arrays.toString(pq) + " " + Arrays.toString(id));
    }
*/