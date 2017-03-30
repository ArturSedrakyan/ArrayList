package exersize;

/**
 * Created by stude on 30.03.2017.
 */
public class Person {
    private String firstName;
    private String lastTime;
    private int age;

    public Person(String firstName, String lastTime, int age) {
        this.firstName = firstName;
        this.lastTime = lastTime;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("%s %s", firstName, age);
    }
}
