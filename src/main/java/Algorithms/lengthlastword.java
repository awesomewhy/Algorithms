package Algorithms;

import java.util.Scanner;
//21. Дан одномерный массив, который содержит не более 25 положительных и отрицательных целых
//чисел. Найти наименьший положительный элемент и его номер в массиве.
//Помогите , пожалуйста(
public class lengthlastword {
    public static void main(String[] args) {
        int[] y = { -5 , 2 , 3, -4, -9  ,2 , 6 , -5};
        int q = 0;
        int index = 0;
        for (int i = 0; i < y.length; i++) {
            if(y[i] > 0){
                q = y[i];
                index = i;
                break;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if(y[i] > 0 ){
                int temp = y[i];
                if(temp < q) {
                    q = y[i];
                    index = i;
                }
            }
        }
        System.out.println(index);
        System.out.println(q);




//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        int[] y = new int[h];

//        if(y.length>25)
//        {
//            System.out.println("массив больше 25 элементов");
//        }
//        int a = 0;
//        while(a < y.length)
//        {
//            int hq = scanner.nextInt();
//            y[a] = hq;
//            a++;
//        }




    }
}
