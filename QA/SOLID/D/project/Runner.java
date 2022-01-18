package test.java;

public class Runner {
    public static void main(String[] args) {
    Project project = new Project();
    BackEndDeveloper backEndDev = new BackEndDeveloper("Back-end Dev");
    FrontEndDeveloper frontEndDev = new FrontEndDeveloper("Front-end Dev");

    printAll(
            project.develop(backEndDev),
            project.develop(frontEndDev)
    );
    }

    public static void printAll(String... strings) {
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
