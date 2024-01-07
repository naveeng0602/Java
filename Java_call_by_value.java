public class Java_call_by_value {
    int a = 50;
     void operate( int x){
        a = a+100;
     }

     public static void main(String[] args) {
        Java_call_by_value sc = new Java_call_by_value();
        System.out.println(sc.a);
        sc.operate(500);
        System.out.println(sc.a);
     }
}
