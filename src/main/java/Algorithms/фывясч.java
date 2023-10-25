package Algorithms;

public class фывясч {
    public static void main(String[] args) {
        int[] y = {-2, -1, 1, 3, 4 , 5};
        int[] a = qwe(y);
        for (int h : a) {
            System.out.println(h);
        }
    }

    public static int[] qwe(int[] y) {
        int l = 0;
        int r = y.length - 1;
        while (l <= r) {
            if (Math.abs(y[l]) >= Math.abs(y[r])) {
                y[r] = y[l] * y[l];
                y[r-1] = y[r] * y[r];

            } else {
                y[r] = y[r] * y[r];
                y[r-1] = y[l] * y[l];
            }
            l++;
            r--;
        }

        return y;
    }
}
