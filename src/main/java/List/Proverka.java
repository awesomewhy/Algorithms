package List;

import java.util.List;

public class Proverka{
    public static void walk(List<Person> list) {
        for (Person person : list)
        {
            if(person.canWalk())
            {
                System.out.println("ходить может");
            }
            else {
                System.out.println("ходить не может");
            }
        }
    }


}
