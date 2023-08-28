package Algorithms;

import java.util.Random;

public class EGERERG {
    public static void main(String[] args) {
        int b = 0;
        Random r = new Random();
        int h = 0;
        int count = 0;
        while(b<100)
        {
            h = r.nextInt(0,16);

            b++;
            if(h == 3)
            {
                count++;
                continue;

            }
            System.out.println(h);

        }
        System.out.println(count);
    }
}
