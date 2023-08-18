
public class ex2 {
   

    public static boolean alphN(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static void a(int n, char c) {
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void p(char[] t) {
        for (int i = 0; i < t.length; i++) {
            if (alphN(t[i])) {
                a(i + 1, t[i]);
            } else {
                System.out.println(t[i]);
            }
        }
    }

    public static void main(String[] args) {
        char[] tab = {'6', '+', 'a', 'B', '*', '4', 'f'};
        p(tab);
    }
}


