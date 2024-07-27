public class pattern {//solid rectangle
    public static void main(String args[]) {
        for( int i=1;i<=4;i++){
            
            for(int j=1;j<=5;j++){
               System.out.print("*");
            }
           System.out.println();
        }//hollow rectangle
        for(int k=1;k<=4;k++){
           for(int a=1;a<=5;a++){
            if(k==1||a==1||k==4||a==5){
               System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
        //half pyramid
        for(int l=1; l<=4; l++){
            for(int s=1;s<=l;s++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int h=4;h>=1;h--){
            for(int m=1;m<=h;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


