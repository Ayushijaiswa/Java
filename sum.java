import java.util.Scanner;

 
public class sum {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)  
    {for(int j=1;j<=4-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();

    }  
    for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
    
}
