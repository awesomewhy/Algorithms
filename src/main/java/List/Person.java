package List;

public class Person {
    private String name;
    private int age;
    private boolean walk;

    public Person(int age, String name, boolean walk)
    {
        this.age = age;
        this.name = name;
        this.walk = walk;
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
    public boolean canWalk()
    {
        return walk;
    }
}
