package Threads;


class MyClass extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Id " + Thread.currentThread().getId() + " Value " + i);
        }
    }
}
public class threads {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();
        MyClass myClass2 = new MyClass();
        myClass2.start();
    }
}