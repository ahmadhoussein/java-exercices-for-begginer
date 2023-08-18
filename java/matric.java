import java.util.Scanner;

 public class matric {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Entrer nb row and col");
        int in = inp.nextInt();
        int row=in;

        int [][]a =new int[row][row];

        for (int i = 0; i <row ; i++) {

            for (int j = 0; j <row ; j++) {
            
                System.out.println("entre le matric");
                a[i][j]+=inp.nextInt();
                

            }
                 
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
       
        



    }
}