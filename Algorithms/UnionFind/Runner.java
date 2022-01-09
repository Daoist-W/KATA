

public class Runner {
    public static void main(String[] args) {

        // example union set
        ArrayList<int[]> unionSet = new ArrayList<>(20);
        pairNums(unionSet, 3, 4);
        pairNums(unionSet, 4, 9);
        pairNums(unionSet, 8, 0);
        pairNums(unionSet, 2, 3);
        pairNums(unionSet, 5, 6);
        pairNums(unionSet, 2, 9);
        pairNums(unionSet, 5, 9);
        pairNums(unionSet, 7, 3);
        pairNums(unionSet, 4, 8);
        pairNums(unionSet, 5, 8);
        pairNums(unionSet, 0, 2);
        pairNums(unionSet, 6, 1);

        // run algorithms
        QuickFindV1.quickFind(unionSet, 10);
        System.out.println(" ");
        QuickUnionV1.quickUnion(unionSet, 10);
    }

    // function to create union pair
    public static void pairNums(ArrayList<int[]> unionSet, int p, int q) {
        unionSet.add(new int[]{p, q});
    }
}
