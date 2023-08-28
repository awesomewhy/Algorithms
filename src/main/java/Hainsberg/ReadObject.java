package Hainsberg;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("qwe.bin");
            ObjectInputStream oos = new ObjectInputStream(file);

            Meow person = (Meow) oos.readObject();
            Meow person1 = (Meow) oos.readObject();

            System.out.println(person);
            System.out.println(person1);


            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
