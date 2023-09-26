package Comporators;

import java.util.*;
//asd

public class Test {
    private static List<Person> list;
    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add(new Person("Artem",1));
        list.add(new Person("Artem",1));
        list.add(new Person("nikita",12));
        list.add(new Person("vlad",14));
        list.add(new Person("arbuz",28));
        list.add(new Person("oleg",11));
        list.add(new Person("timur",54));
        list.add(new Person("arbuz",28));
        list.add(new Person("georgy",4));

        Collections.sort(list);

        for(Person person : list) {

            person.compareTo(person);
            System.out.println(person);
        }

    }
}
