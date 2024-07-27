import java.util.*;
public class why {
    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
      int n=sc.nextInt();
      
    do{
       
    
    if(a==1){
       for(int i=0;i<=n;i++){
        System.out.println(i);
        switch (i) {
            case 1:
            if(i>=90){
                System.out.println("this is good");
            }
                break;
        case 2:
        if(89>=i||i>=60){
System.out.println("this is also good");

        }
        break;
        case 3:
        if(i>=50){
            System.out.println("this is good as well");
        }break;
            default:
            System.out.println("marks does not matter");
         
            break;
            
        }
    }
       while(n==0);
       
        
       
        }
    }
}  
    
}


    
    

