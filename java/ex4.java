import java.util.Scanner;

public class ex4 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("entrer le size :");
        int a = in.nextInt();
       int arr []=new int[a];
        for(int i =0;i<a;i++){
            System.out.println("entrer le element nombre "+i);
            arr[i]  += in.nextInt();  
        }
        int sum=0;
        for( int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("le sum ="+sum  );
        System.out.println("average ="+(sum/arr.length));
        int diff;
        int alpha= 0;
        for(int j=0;j<arr.length;j++){
            diff =  sum- arr[j];
            System.out.println("le nombre diffrence de average ="+diff);
            alpha += Math.pow( Math.log(j),diff);


        }
        System.out.println("le standard deviation ="+Math.sqrt(alpha));
        

    }
}
