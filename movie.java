import java.util.Scanner;
 
public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int t = 1, i = 0, count = 0;
        while (n > 0) {
            while ((t + x) <= a[i][0]) {
                t = t + x;
            }
            count = count+a[i][1] - t+1;
            t = a[i][1]+1;
            i++;
            n--;
        }
 
 
        System.out.println(count);
 
 
    }
}