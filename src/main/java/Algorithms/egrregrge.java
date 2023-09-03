package Algorithms;

import java.util.*;


public class egrregrge {
    public static void main(String[] args) {
//        System.out.println(revolvers(3,4));
        System.out.println(sheriff("sheriqffsheriff"));
    }

    public static int revolvers(int revolvers, int dollars)
    {
        Random r = new Random();
        int[] y = {5, 12, 10};
        for (int i = 0; i < y.length; i++) {
        }
        int result = 0;
        for (int i = 0; i < y.length; i++) {
            if(y[i] < dollars)
            {
                result = Math.max(y[i],result);
            }
        }
        return result;
    }
    public static int sheriff(String y){
        Map<Character,Integer> list = new HashMap<>();
        String s = "sheriff";
        int result = 0;
        for (int i = 0; i < y.length(); i++) {
            if (list.containsKey(y.charAt(i))) {
                int currentValue = list.get(y.charAt(i));
                list.put(y.charAt(i), currentValue + 1);
            } else {
                list.put(y.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i); // Получаем символ из строки
            int currentValue = list.getOrDefault(key, 0); // Получаем текущее значение по ключу или 0, если ключ не существует
            String h = s;

            boolean f = false;

            for (int j = 0; j < h.length(); j++) {
                int d = s.charAt(j);
                if(Character.isLetter(d))
                {
                    f = true;
                    break;
                }
                if(!f)
                {
                    result++;
                    h = "sheriff";

                }
            }
            if (currentValue > 1) {
                h = h.replaceFirst(Character.toString(i),"");

                list.put(key, currentValue - 1); // Уменьшаем значение на 1 и обновляем в map
            } else {
                list.remove(key); // Если значение было 1 или меньше, удаляем элемент из map
            }
        }


        return result;

    }
}
