class Student{
    String name;
    int rollno;
    static int age =32 ;
     Student( String name , int rollno )
     {
        this.name = name;
        this.rollno = rollno;
     }    
     void display(){
        System.out.println(name + " " + rollno +" "+ age );
}}

 class Java_this_static {
    public static void main(String[] args) {
        Student sc  = new Student("Naveen", 34);
         sc.display();
    }
    
}
