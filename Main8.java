import java.util.Scanner;
 
public class Main8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        int[] a= new int[k];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        long count=0;
        int i=0,h=1;
        while (k>0){
            if(a[i]<h){
                count=count+(n-h)+(a[i]);
            }
            else {
                count = count + a[i] - h;
            }
            h = a[i];
            i++;
            k--;
        }
        System.out.println(count);
    }
}