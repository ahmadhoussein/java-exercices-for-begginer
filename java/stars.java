import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        ArrayList < String>diviseur=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>nombre = new ArrayList<Integer>();
       ArrayList<ArrayList <Integer>>listDiv = new ArrayList<>();
       int a;
       do{
        System.out.println("entrer un nombre ");
        a = in.nextInt();


       }while(a<0);
       for (int i = 0; i < a; i++) {
        System.out.println("entrer nombre "+(i++)+":");
        int x = in.nextInt();
        nombre.add(x);
       }
       System.out.println();
       listDiv=listDiviseur(nombre);
       for (int i = 0; i < nombre.size(); i++) {
        int n =nombre.get(i);
        ArrayList<Integer>ndiv = new ArrayList<>();
        ndiv = listDiv.get(i);
        System.out.println("le nombre "+n+"a come diviseure");
        for (int j = 0; j < ndiv.size(); j++) {
            System.out.println(ndiv.get(j)+" ");
        }
        
       }
        
    }
    public static ArrayList <ArrayList <Integer>> listDiviseur(ArrayList<Integer>AR) {
        ArrayList<ArrayList <Integer>>diviseur = new ArrayList<>();
        for (int i = 0; i < AR.size(); i++) {
            ArrayList<Integer>div = new ArrayList<Integer>();
            int n = AR.get(i);
            for (int j = 1; j < n; j++) {
                Integer temp = new Integer(j);
                div.add(temp);
            }
            diviseur.add(div);
        }
        return diviseur;
      
       
    }
}
