package exersize;

import java.util.Comparator;

/**
 * Created by stude on 30.03.2017.
 */
public class firstNameComp implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

}
