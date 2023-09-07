package Comporators;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + id;
    }

    @Override
    public int compareTo(@NotNull Person person) {
        if(person.getId() == id){
            return 0;
        }
        if(person.getId() > id){
            return 1;
        }
        return  -0;
    }
}
