import java.util.*;
class Reverse {
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please inter the numbers:");
        int reverse = 0;
        int i = sc.nextInt();
        while(i!=0){
             reverse = reverse*10 + i%10;
            i = i/10;
        } 
        System.out.println("Number after reverse :"  + reverse);
    sc.close();
    }
}