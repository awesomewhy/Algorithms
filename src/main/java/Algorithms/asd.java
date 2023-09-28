package Algorithms;


public class asd {
    public static void main(String[] args) {
        //checked something
        int[] y = {1, 3, 5, 2, 4, 9};

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if(y[i]-y[j] < 0) {
                    int temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }
            }
        }
        for(Integer i : y) {
            System.out.println(i);
        }

    }
}
