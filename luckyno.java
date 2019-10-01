import java.util.Scanner;
 
public class luckyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k=sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int flag=0;
        for (int i=0;i<n;i++) {
            int count = 0, p = 0;
 
            while (a[i] > 0) {
                p = a[i] % 10;
                a[i] = a[i] / 10;
                if (p == 4 || p == 7)
                    count++;
            }
            if(count<=k)
                flag++;
        }
        System.out.println(flag);
 
 
        }
}