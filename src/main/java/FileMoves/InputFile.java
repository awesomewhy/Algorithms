package FileMoves;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InputFile{


    public static void main(String[] args) {
        Person person = new Person(234,"qwe");
        Person person1 = new Person(8,"asasd");
        try{
            FileOutputStream file = new FileOutputStream("FileTestBin.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(person);
            oos.writeObject(person1);

            oos.close();
        }


        catch (IOException e)
        {
            e.printStackTrace();
        }
        person1.equals(person1);

    }
}
