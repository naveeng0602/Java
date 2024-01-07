import java.lang.*;
import java.util.*;;

public class Java_finalize {
    public static void main(String[] args) {
        Java_finalize sc = new Java_finalize();
        System.out.println(sc.hashCode());
        sc = null;
        System.gc();

        System.out.println("Enter name");
        
    }
    protected void finalize(){
System.out.println("finalize method all");
    }
}

