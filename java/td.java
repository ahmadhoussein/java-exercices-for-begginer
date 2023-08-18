import java.util.Scanner;

public class td{
  
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println("entrer la premier:");
        int n = in.nextInt();
        int a =4;
        int b =10;
        int arr [][] ;
        arr=new int [a][b];

        int c=n;
    

        for (int i = 0; i < a; i++) {
           
            for (int j = 0; j < b; j++) {
                c +=5;
                arr[i][j]+=c;
                System.out.print(arr[i][j]+"    ");
              
            }
            System.out.println();
        }
        
       
    }

}