import java.util.Scanner;
public class StringPlaindrom {
    public static void main(String[] args) {
        
   
    String original, reverse="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Strings");
    original = sc.nextLine();
    int length = original.length();
    
    for(int i = length-1; i>=0; i--){
        reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("String is a palindrom");
        }
        else{
            System.out.println("String is not palindrom");
        }
        sc.close();
    
}
 }
