public class advanced {
    public static void main(String args[]) {
        //butterfly pattern
        //row i
        for(int i =1;i<=4;i++){
       //     upperhalf
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
       //forspaces
       int spaces=2*(4-i);
       for (int j=1;j<=spaces;j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++)
       {
        System.out.print("*");
       }System.err.println();

        }
        for( int i=4;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(4-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }System.out.println();
            
            }
            //solidrhombus
            for(int i=1;i<=5;i++)
            {
               
                int spaces=5-i;
                for(int j=1;j<=spaces;j++){
                System.out.print(" ");}
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }System.out.println();

            }
            //holloerhombus
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                   if(i==5||j==5||i==8||j==9){
                    System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                }System.out.println();
            }
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5-i;j++){//space
                    System.out.print(" ");
                }for(int j=1;j<=i;j++){//row no row no times
                    System.out.print(i+" ");
                }System.out.println();
            }//palindromic pattern samne se piche se kahi se bhi pdho same lgte h
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }for(int j=i;j>=1;j--){
                    System.out.print(j);
                }for(int j=2;j<=i;j++){
                    System.out.print(j);
                }System.out.println();
            }//diamondpatttern
            int n=4;
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }for( int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }System.out.println();}
                //upperhlf
                for(int k=n;k>=1;k--){
                    //spaces
                    for(int j=1;j<=n-k;j++){
                        System.out.print(" ");
                    }for( int j=1;j<=2*k-1;j++){
                        System.out.print("*");
                    }System.out.println();

            }




        }
     
    }
    

