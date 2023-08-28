package Algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        String[] y = {"flower","flow","flight"};
        String s = longestCommonPrefix(y);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] y) {
        Arrays.sort(y);
        String s1 = y[0];
        String s2 = y[y.length-1];
        int ind = 0;
        while(ind < s1.length() && ind < s2.length())
        {
            if(s1.charAt(ind) == s2.charAt(ind))
            {
                ind++;
            }
            else {
                break;
            }
        }
        return s1.substring(0,ind);
    }
}
