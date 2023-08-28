package Algorithms;

public class asfdg {
    public static void main(String[] args) {
        String s = "ooxx";
        System.out.println(getXO(s));
    }
    public static boolean getXO(String y) {
        int sum = 0;
        for (int i = 0; i < y.length(); i++) {
            if(y.toLowerCase().charAt(i) == 'x')
            {
                sum++;
            }
            if(y.toLowerCase().charAt(i) == 'o')
            {
                sum--;
            }

        }
        if (sum == 0)
            return true;
        return false;
    }
}
