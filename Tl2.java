import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Tl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int v=-1;
        for(int i=a[0];i<b[0];i++) {
          //  System.out.println(i);
            if (i >= a[n - 1] && i >= 2 * a[0]) {
               // System.out.println(i+" in");
                v = i;
                break;
            }
        }
        System.out.println(v);
    }
}