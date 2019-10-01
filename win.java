import java.util.Scanner;
 
public class contest {
    public static void win(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int m1 = (3 * a) / 10;
        int m2 = a - ((a / 250) * c);
        int m = Math.max(m1, m2);
        int v1 = (3 * b) / 10;
        int v2 = b - ((b / 250) * d);
        int v = Math.max(v1, v2);
        if (m == v)
            System.out.println("Tie");
        else if (m > v)
            System.out.println("Misha");
        else
            System.out.println("Vasya");
    }
}