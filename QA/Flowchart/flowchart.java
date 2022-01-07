
public class Flowchart {
    

    public static int flowchart(int arg1, int arg2, boolean arg3) {
        // define variables
        int num;

        if (arg3 == true) {
            num = arg1 * arg2;    
        } else  {
            num = arg1 + arg2;
        }

        return num;
    }


    public static int flowchart2(int A) {

        
        if(A > 2000) {
            System.out.println("A");
            
            // branch A
            if(A > 6000) {
                System.out.println("C");
                // END
            } else {
                System.out.println("B");

                // branch B
                if(A > 4000) {
                    System.out.println("D");
                    // END
                } else {
                    System.out.println("E");
                } // END
            }
        } else { // branch 1
            System.out.println("1");

            // branch 3
            if(A > 100) {
                System.out.println("3");

                // branch 5
                if(A > 600) {
                    System.out.println("5");
                    // END          
                } else { // branch 4
                    System.out.println("4");

                    if (A > 500) {
                        // branch 6
                        System.out.println("6");
                        // END
                    } else {
                        // branch 7
                        System.out.println("7");
                        // END
                    }
                }

            } else {
                System.out.println("2");
                // END
            }
        }



    }
}