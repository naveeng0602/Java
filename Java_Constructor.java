public class Java_Constructor {

    // PARAMETERIZE CONSTRUCTOR //

    //  int a; 
    // Java_Constructor(int x) {
    //     a = x ;
    //     }
    //     void display(){
    //     System.out.println(a);
    // }

//  COSNTRUCTOR OVERLOADING 

        int a ;
        String x; 
        int m;
        Java_Constructor(int i , String p){
            a = i;
            x = p; 
        }
        
        Java_Constructor(int i , String p , int n){
            a = i;
            x = p; 
            m = n;
        }

        void display(){
            System.out.println(a + " " + x + " "+ m );
        }




    public static void main(String[] args) {
        Java_Constructor sc = new Java_Constructor(5,"naveen", 22);
        sc.display();

    }
}
