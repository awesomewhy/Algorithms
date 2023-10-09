package Threads;

public class Test {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread1.start();
    }
}
