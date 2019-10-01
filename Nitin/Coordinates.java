import java.util.Scanner;
 
public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
 
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
 
        int count=0;
        for(int i=0;i<n;i++) {
            //for (int j = 0; j < 2; j++) {
                int flag = 0;
                int l=0,r=0,u=0,d=0;
                for (int k = 0; k < n; k++) {
 
                    if (l==0) {
                        if (a[i][0] > a[k][0] && a[i][1] == a[k][1]) {
                            flag++;
                           // System.out.println("flag =" + flag);
                            l++;
                        }
                    }
                    if(r==0) {
                        if (a[i][0] < a[k][0] && a[i][1] == a[k][1]) {
                            flag++;
                            //System.out.println("flag =" + flag);
                            r++;
                        }
                    }
                    if(d==0) {
                        if (a[i][0] == a[k][0] && a[i][1] > a[k][1]) {
                            flag++;
                            //System.out.println("flag =" + flag);
                            d++;
                        }
                    }
                    if(u==0) {
                        if (a[i][0] == a[k][0] && a[i][1] < a[k][1]) {
                            flag++;
                            //System.out.println("flag =" + flag);
                            u++;
                        }
                    }
 
                }
            if (flag >= 4)
                count++;
            //System.out.println("count =" + count);
          //  }
        }
       System.out.println(count);
        }
}