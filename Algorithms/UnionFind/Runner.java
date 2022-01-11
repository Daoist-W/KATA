

public class Runner {
    public static void main(String[] args) {

        // example union set
        ArrayList<int[]> unionSet = new ArrayList<>(10_000);
        // pairNums(unionSet, 3, 4);
        // pairNums(unionSet, 4, 9);
        // pairNums(unionSet, 8, 0);
        // pairNums(unionSet, 2, 3);
        // pairNums(unionSet, 5, 6);
        // pairNums(unionSet, 2, 9);
        // pairNums(unionSet, 5, 9);
        // pairNums(unionSet, 7, 3);
        // pairNums(unionSet, 4, 8);
        // pairNums(unionSet, 5, 8);
        // pairNums(unionSet, 0, 2);
        // pairNums(unionSet, 6, 1);

        // generating an array of random numbers for pairNums
        int N = 1000;
        int M = 6206;
        int random1;
        int random2; 
        for(int i = 0; i < M; i++) {
            random1 = (int)(Math.random() * N + 1);
            random2 = (int)(Math.random() * N + 1);
            pairNums(unionSet, random1, random2);
        }

        // run algorithms

        QuickFindV1.quickFind(unionSet, N);
        System.out.println(" ");
        QuickUnionV1.quickUnion(unionSet, N);
    }

    // function to create union pair
    public static void pairNums(ArrayList<int[]> unionSet, int p, int q) {
        unionSet.add(new int[]{p, q});
    }
}
