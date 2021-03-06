
public class Coins {
        public static void coins(double cash, double cost) {
        double payment = cash - cost;
        System.out.println(payment);

        int[] notes = {100, 50, 20, 10, 5};
        int[] pounds = {2, 1};
        int[] coins = {50, 20, 10, 5, 2, 1};

        int numNote = 0;
        int numPound = 0;
        int numCoin = 0;

        for (int note : notes) {
            if (payment / note >= 1) {
                numNote = (int) (payment / note);
                payment -= numNote * note;
                System.out.println(numNote + " £" + note + " note");
            }
        }

        for (int pound : pounds) {
            if (payment / pound >= 1) {
                numPound = (int) (payment / pound);
                payment -= numPound * pound;
                System.out.println(numPound + " £" + pound + " coin");
            }
        }

        for (int coin : coins) {
            if (payment * 100 / coin >= 1) {
                numCoin = (int) (payment * 100 / coin);
                payment -= numCoin * coin * 0.01;
                System.out.println(numCoin + " " + coin + "p coin");
            }
        }


    }
}