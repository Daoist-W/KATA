public class App {
    public static void main(String[] args) {
        travelApp();
    }

    public static void travelApp() {
        DirectionService myTravelApp = new DirectionService();

        myTravelApp.setTravelMode(new Driving());
        myTravelApp.getEta();
        myTravelApp.getDirection();

        myTravelApp.setTravelMode(new Transit());
        myTravelApp.getEta();
        myTravelApp.getDirection();

        myTravelApp.setTravelMode(new Cycling());
        myTravelApp.getEta();
        myTravelApp.getDirection();

        myTravelApp.setTravelMode(new Walking());
        myTravelApp.getEta();
        myTravelApp.getDirection();
    }


}
