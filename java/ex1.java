
import java.util.Scanner;
class ahmd{

    public static void test(int a[]) {

        int c=0;
           for(int i =0;i<a.length;i++){
               
               if(a[i] % 4==0){
                   c++;
                   if(c==a.length){
                       System.out.println("tous les nombre mul de 4");
                    
       
                   }
                   
               }
               else {
                   System.out.println("ne sont pas mul de 4");
                   break;
               }
              
           }
           
           
       }

public static void main(String[]args){
    
Scanner in = new Scanner(System.in);

int n=0;
do{System.out.println("entrer le taille du tableau positive :");
 n = in.nextInt();}
while((n >=50) || n<=1  );
int t []; 
t = new int [n];



for (int i = 0;i<t.length;i++){
System.out.println("entrer un entier:");
t[i] += in.nextInt();
}

test(t);


}

}
  
