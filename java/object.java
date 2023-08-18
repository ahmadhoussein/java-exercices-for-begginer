import java.util.ArrayList;
import java.util.Scanner;

public class object {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> mot = new ArrayList<String>();
        mot.add("A");
        mot.add("L");
        mot.add("G");
        mot.add("O");
        mot.add("R");
        mot.add("I");
        mot.add("T");
        mot.add("H");
        mot.add("M");

        ArrayList<ArrayList<String>> result = algo(mot);
        System.out.println("Even: " + result.get(0));
        System.out.println("Odd: " + result.get(1));
    }

    public static ArrayList<ArrayList<String>> algo(ArrayList<String> AR) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < AR.size(); i++) {
            String n = AR.get(i);
            if (n.length() % 2 == 0) {
                b.add(n);
            } else {
                c.add(n);
            }
        }

        result.add(b);
        result.add(c);
        return result;
    }
}
