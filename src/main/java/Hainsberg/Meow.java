package Hainsberg;

import java.io.Serializable;

public class Meow implements Serializable {
    private int id;
    private String name;
    public Meow(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return id + " : " + name;
    }
}
