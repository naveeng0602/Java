abstract  class A {
abstract void show();
}

class B extends A {
     @Override void show(){
        System.out.println("running");
    }
}


 class Java_Abstract {
   
    public static void main(String[] args) {
        A sc = new B();
        sc.show();
    }
    
}
