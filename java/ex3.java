public class ex3 {
    public static void main(String[] args) {
        int a[] ={11,22,33,44,55};
        int b[] = new int[a.length ];
        
        for(int i=0,j=a.length-1;i<a.length;i++,j--){
            b[j]=a[i];
           
            
        }
        for(int i =0;i<b.length;i++){
        
            System.out.println("b [ "+i+ "] ="+b[i]);
    }}

   
}
