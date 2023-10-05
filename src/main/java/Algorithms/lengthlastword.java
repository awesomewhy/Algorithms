package Algorithms;

public class lengthlastword {
    public static void main(String[] args) {
        String s = "Hello World";
        int a = lengthOfLastWord(s);
        System.out.println(a);
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int sum = 0;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            if(s.charAt(i) != ' ') {
                sum++;
            }
            else{
                return sum;
            }
        }
        return sum;
    }
}
