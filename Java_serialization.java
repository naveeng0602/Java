import java.io.*;
import java.io.Serializable; 



 class Student implements Serializable{  
 int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}
public class Java_serialization {
    public static void main(String[] args) {
        try {
            //SERIALIZATION
            
            //  Student s = new Student(211, "Naveen");
            // FileOutputStream fout = new FileOutputStream("f.txt");
            // ObjectOutputStream out = new ObjectOutputStream(fout);
            // out.writeObject(s);
            // out.flush();
            // out.close();
            // System.out.println("success");

            //DESERIALIZATION//

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student)in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
}
