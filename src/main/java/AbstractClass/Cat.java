package AbstractClass;

public class Cat extends PersonProperties{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.walk();
        cat.eat();
    }

    @Override
    public void walk() {
        System.out.println("кошка бегает 15км в час");
    }
}
