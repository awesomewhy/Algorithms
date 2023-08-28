package List;

import java.util.ArrayList;
import java.util.List;

public class MyClass{
    public static void main(String[] args) {


        Person person = new Person(2,"24",true);

        List<Person> list = new ArrayList<>();
        list.add(new Person(16,"artem",true));
        list.add(new Person(2,"riba",false));
        list.add(new Person(10,"bird",true));

        Proverka.walk(list);
    }


}
