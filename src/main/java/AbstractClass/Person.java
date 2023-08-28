package AbstractClass;

public class Person extends PersonProperties {
    public static void main(String[] args) {
        Person personAb = new Person();
        personAb.eat();
        personAb.walk();
        System.out.println(personAb instanceof Person);
    }
    @Override
    public void walk() {
        System.out.println("человек ходит 5км в час");
    }
}
