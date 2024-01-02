import java.util.Scanner;

public class SimplePattern2negi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Pattern
        for(int i= 10; i<=n;i++){
            for(int j=10; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        
        //Char Pattern//
        // for(char i = 'A'; i<=n;i++){
        //     for(char j='A'; j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        // First Pattern

        // for(int i= 1; i<=n;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=n;i++)
        // {
        //     System.out.print(i+ " ");
        // }

        sc.close();
    }
}
