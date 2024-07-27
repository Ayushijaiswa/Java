import java.util.*;
public class tablen {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for( int i=1;i<n;i++)
        {
            int even=(i+1);
          if  (even%2==0){
            System.out.println(even);
          }
            
        }
    }
    
}
