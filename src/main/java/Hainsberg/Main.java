package Hainsberg;
import java.io.*;

public class Main extends Person implements Info {
    public Main()
    {
        super(3,"wqe");
    }
    public static void main(String[] args){


//        String y = "qwe";
//        String h = new String("qwe");
//        System.out.println(y.equals(h));

        Meow person = new Meow(6,"artem");

        Meow person1 = new Meow(8,"nikita");
        int a = 123;



        try{
            FileOutputStream file = new FileOutputStream("qwe.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(person);
            oos.writeObject(person1);

            oos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        int[] y = {1};
        for (int i = 0; i < y.length; i++)
        {

        }
        for (int i = 0; i < y.length; i++) {

        }










//        Person person = new Person(2);
//        Noob noob = new Noob();
//        noob.Sound();
//        List<Noob> list = new ArrayList<>();
//        list.add(new Noob());
//
//        test(list);










//        String separator = File.separator;
//        String path = separator + "C:" + separator +  "Users"+ separator + "seren"+ separator + "OneDrive"+ separator + "Рабочий стол"+ separator + "file.txt";
//        File file = new File(path);
//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println("wqewsdfewrfgrgewf");
//
//        printWriter.close();







//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a Name: ");
//        String name = in.next();
//        System.out.print("Input a Number: ");
//        int num = in.nextInt();
//
//        in.close();
//        SetAndGetNameAndAge(name, num);
//        Qwe qwe = new Qwe();
//        System.out.println(qwe);
//        qwe.Govor();
//        InfoGet(qwe);
//        Main.InfoGet(qwe);
//        int a = 234;
//        long l = 234234234324L;
//        float f = (float)32.0;
//        List<Person> list = new ArrayList<>();
//        list.add(new Person(3));
//        list.add(new Person(2));
//        list.add(new Hack());
//        list.add(new Noob());
//        test(list);
//        List<Hack> hack = new ArrayList<>();
//        hack.add(new Hack());
//
//        test(hack);
//        Person person1 = new Person(3)
//        {
//            public String qwe(String asd)
//            {
//                System.out.println(asd + "ewrewf");
//
//                return asd + "egsrgregregre";
//            }
//        };
//        Person person = new Person(2);
//        person.qwe("wqe");
//        person1.qwe("rwe");
//        Info info = new Info(){
//            public void Govor()
//            {
//                System.out.println("123");
//            }
//            public void eat()
//            {
//                System.out.println("est");
//            }
//        };
//        info.eat();





    }
//    public static void test(List<? extends Person> list)
//    {
//        for (Person person : list)
//        {
//            System.out.println(person);
//        }
//
//    }
}