import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        if (n%2==0) {
            System.out.println("NO");
            System.exit(0);
        }
        char c=s[0].charAt(1);
        char d=s[0].charAt(0);
 
 
 
        int flag=0;
        for (int i=0;i<n/2;i++) {
            if (s[i].charAt(i) != s[i].charAt(n - i - 1)) {
                flag++;
           
                break;
            }
        }
     
if(s[n/2].charAt(n/2) !=d){
    System.out.println("NO");
    System.exit(0);
}
 
        if(flag==0){
            for (int i=n-1;i>n/2;i--) {
                if (s[i].charAt(i) != s[i].charAt(n - i - 1)) {
                    flag++;
                   // System.out.println("OK2");
                    break;
                }
            }
        }
 
 
        if(flag==0){
 
            if(c==d){
                System.out.println("NO");
                System.exit(0);
            }
 
           // System.out.println(c);
            for (int i=0;i<s.length;i++){
                    for (int j=0;j<s.length;j++){
 
                        if(j!=i && j!=(n-i-1)) {
                            if(s[i].charAt(j)!=c){
                                flag++;
                             
                                break;
                            }
                         
                    }
                }
                    if(flag==1)
                        break;
            }
        }
      
        if (flag==0)
            System.out.println("YES");
        else
            System.out.println("NO");
 
 

        }
    }