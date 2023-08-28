package FileMoves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile{


    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("FileTestBin.bin");
            ObjectInputStream oos = new ObjectInputStream(file);

            Person person = (Person) oos.readObject();
            Person person1 = (Person) oos.readObject();

            System.out.println(person);
            System.out.println(person1);


            oos.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
}
