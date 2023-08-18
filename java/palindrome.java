import java.util.ArrayList;
import java.util.List;

class ahmad{
    public static void main(String[] args) {
    ArrayList<String>list = new ArrayList<>(10);
    list.add("ahmad")  ;  
    list.add("ana")  ;  
    list.add("lol")  ;  
    list.add("madam")  ;  
    list.add("fadi")  ;  
    list.add("aabaa")  ;  
    list.add("amma")  ;  
    list.add("hhghh")  ;  
    list.add("jajl")  ;  
    list.add("kkikk")  ;  
    palindrom(list);
    
    }
    public static  ArrayList<String>palindrom(ArrayList<String> strings) {
        ArrayList<String>pali = new ArrayList<>();
        for(int i =0; i<strings.size();i++){
            if(pali(strings.get(i))==true){
                pali.add(strings.get(i));
            }
        }
        
       
    }
    public static boolean pali(String str){
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                return true;
        }
      
    }

}