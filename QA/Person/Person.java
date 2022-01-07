

public class Person {
    // fields
    String name = "unknown";
    int age;
    String jobTitle = "unknown";

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    @Override
    public String toString() {
        return "Person{" +
                " Name: " + name +
                ", Age: " + age +
                ", Job Title: '" + jobTitle + '\'' +
                " }";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}