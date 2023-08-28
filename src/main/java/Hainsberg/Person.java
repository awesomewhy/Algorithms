package Hainsberg;

import java.io.Serializable;

public class Person extends Abclass implements Info, Serializable {
    private String name;
    private int age;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }



    public int getAge()
    {
        System.out.println(age);
        return age;
    }
    public String getName()
    {
        System.out.println(name);
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }



    @Override
    public String toString()
    {
        return age + "";
    }
    public void eat()
    {
        System.out.println("qwe");
    }
    public String qwe(String asd)
    {
        System.out.println(asd + "aaaaaaaaaa");

        return asd;
    }
    public String qwe(String asd, String h)
    {
        return asd + h;
    }
    @Override
    public void Govor()
    {
        System.out.println("noob");
    }
    @Override
    public void Sound(){
        System.out.println("privet");
    }

}
