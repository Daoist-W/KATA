package test.java;

public class Runner {
    public static void main(String[] args) {

        Dodo dodo = new Dodo(10);
        Falcon falcon = new Falcon(100);

        falcon.fly();
        dodo.goExtinct();
        printAll(dodo.getCurrentLocation());

    }

    public static void printAll(String... strings) {
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
