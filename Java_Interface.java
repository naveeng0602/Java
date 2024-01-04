// /**
//  * Java_Interface
//  */



/**
 MULTIPLE INHERITANCE USING INTERFACE
 */
interface Printable{
    void print();
}
interface Display{
void display();
}


public class Java_Interface implements Printable,Display {

    public void print()
    {
        System.out.println("hello");
    }
    public void display(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        Java_Interface sc = new Java_Interface();
        sc.display();
        sc.print();
    }
}

//  interface Drawable{  
//     void draw();  
//     }  
//     //Implementation: by second user  
//     class Rectangle implements Drawable{  
//     public void draw(){System.out.println("drawing rectangle");}  
//     }  
//     class Circle implements Drawable{  
//     public void draw(){System.out.println("drawing circle");}  
//     }  
//     //Using interface: by third user  
//     class Java_Interface{  
//     public static void main(String args[]){  
//     Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
//     d.draw();  
//     }}  


