package exersize;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created by stude on 30.03.2017.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>(5);

        Person person1 = new Person("Artur","Sedrakyan",19);
        Person person2 = new Person("Narek","Margaryan",19);
        Person person3 = new Person("Karen","Poxosyan",21);
        Person person4 = new Person("Narek","Sahakyan",18);
        Person person5 = new Person("Vahag","Barsexyan",25);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        Scanner scanner = new Scanner(System.in);
        int variant = scanner.nextInt();

        Comparator<Person> comparate = getComp(variant);

        Collections.sort(persons,comparate);

        for(Person p: persons){
            System.out.println(p);
        }

    }
    public static Comparator<Person> getComp(int sortType) {
        switch (sortType) {
            case 1:
                return new firstNameComp();
            case 2:
                return new compAge();
        }
        return null;
    }
    }
