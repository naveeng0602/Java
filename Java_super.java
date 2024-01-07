import java.lang.*;

class A {
public int a = 10;
}
class B extends A{
    int a = 50;
    void show(){
        System.out.println(super.a);
    }
}


public class Java_super {
    public static void main(String[] args) {
        B sc = new B();
        sc.show();
    }
}
