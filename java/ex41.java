import java.util.Scanner;

public class ex41 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int  [][] a=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("entrer ");
                a[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }

    }

}
