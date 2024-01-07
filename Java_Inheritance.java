import java.lang.*;


//  Simple Inheritance, Multilevel Inheritance, and Hierarchical Inheritance//

class A {
    void eat(){
        System.out.println("Eating____");
    }
}
class B extends A {
    void display(){
        System.out.println(" Display");
    }
}
// class C extends B{
//     void show(){
//         System.out.println(" Show ====");
//     }
// }


class C extends A{
    void show (){
        System.out.println("Showw +++++");
    }
}



public class Java_Inheritance {
    public static void main(String[] args) {
        C sc = new C();
        
        sc.eat();
        // sc.display();
        sc.show();


    }
}
