// class A // extends Thread 
class A implements Runnable{
    public void run (){
        for(int i=1; i<=5;i++)
        {
            System.out.println("i=" +i);
        }
    }
}
// class B extends Thread
class B implements Runnable {
    public void run (){
        for(int i=1; i<=5;i++)
        {
            System.out.println("i=" +i);
        }
    }
}

public class multithread_Runnable {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        t1.start();
        t2.start();

    }
}
