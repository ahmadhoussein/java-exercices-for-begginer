import java.util.ArrayList;
import java.util.Scanner;

public class exx {
    

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n=0;
      do {
        System.out.println("entrer un nombre ");
         n = in.nextInt();

      }while(n<5 && n>15 );
      for (int b = 0; b<1; b++) {
        for (int i = 0; i < n; i++) {
         for (int j = 0; j < i; j++) {
          System.out.print(" ");
        
         }
         for (int j = n; j >i; j--) {
            System.out.print("*");
         }
        
         
         System.out.println();
      }
      
        for (int i = 0; i < n; i++) {
          for (int j = n; j >i; j--) {
            System.out.print(" ");
         }
         for (int j = 0; j < i; j++) {
          System.out.print("*");
        
         }
       
        
         
         System.out.println();
      }
      

      }


    }

}
