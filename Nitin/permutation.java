import java.util.Scanner;
 
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        if (n % 2 != 0) {
            System.out.println("-1");
            System.exit(0);
        } else {
            for (int i = 0; i < a.length; i = i + 2) {
                a[i] = i + 2;
                a[i + 1] = i + 1;
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }
}