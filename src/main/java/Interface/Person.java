package Interface;

import Hainsberg.Info;

public class Person implements Information {
    public static void main(String[] args) {
        Person person = new Person();
        person.getNameInfo();
        person.food();
        person.rost();
    }
    public void getNameInfo()
    {
        System.out.println("artem");
    }
    public void rost()
    {
        System.out.println("192");
    }
    public void food()
    {
        System.out.println("pizza");
    }
}
