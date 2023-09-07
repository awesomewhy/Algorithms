package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class as {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
