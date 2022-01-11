import java.util.Objects;

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

    // overridden methods
    @Override
    public String toString() {
        return "Person{" +
                " Name: " + name +
                ", Age: " + age +
                ", Job Title: '" + jobTitle + '\'' +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(),
                person.getName()) && Objects.equals(getJobTitle(),
                person.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getJobTitle());
    }

    // class methods

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
