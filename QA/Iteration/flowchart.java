
public class Flowchart {



    public static void flowchart1 () {
        int A = 100;

        while(A < 200) {
            System.out.pritnln(A);
            A++;
        }
    }

    public static void flowchart2 () {
        int A = 100;

        while(A <= 200) {

            if(A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }

            A++
        }

        // alternative with for loop

        for(int i = 0; i < 200 - A; i++) {

            if(A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }

    }


    public static void flowchart3() {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i);
            }
        }
    }

    public static void flowchart4 () {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }
}