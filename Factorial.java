import java.util.*;

public class Factorial {
    static long fact(long num){
        if(num==0){
            return 1;
        }
        else{
            return (num * fact(num-1));
        }
    }
    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Whole number to find factorial");
        num = sc.nextInt();
        System.out.println("factorial = " + fact(num));
        sc.close();
    }

    
}

