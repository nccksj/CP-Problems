import java.util.Scanner;
 
public class Main3 {
    public static boolean isCoprime(long x, long y){
        while (x!=0){
            long r=y%x;
            y=x;
            x=r;
        }
        if(y==1)
            return true;
        else
            return false;
    }
 
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        long l=sc.nextLong(), r=sc.nextLong();
        int flag=0;
        if((r-l)<2) {
            System.out.println("-1");
            System.exit(0);
        }while (flag!=1 && l<r) {
            for (int i = 1; i <= (r - l); i++) {
                if (isCoprime(l, l + i) == true) {
                    for (int j = 1; j <= (r - l - i); j++) {
                        if (isCoprime(l + i, l + i + j) == true) {
                            if (isCoprime(l, l + i + j) == false) {
                                System.out.println(l + " " + (l + i) + " " + (l + i + j));
                                flag = 1;
                            }
                        }
                        if (flag == 1)
                            break;
                    }
                }
                if (flag == 1)
                    break;
            }
            l++;
 
        }
        if(l==r)
            System.out.println("-1");
 
    }
}