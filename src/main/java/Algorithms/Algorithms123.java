package Algorithms;

public class Algorithms123 {
    public static void main(String[] args) {
        rec(5);
    }
    public static void rec(int a)
    {
        System.out.println(a);
        rec(a);
    }
}
