public class flods {
    public static void main(String args[]) { int Number=1;
for(int i =1;i<=5;i++)//i is row and j is column
{
    for(int j=1;j<=i;j++){
       // int k=j+1;
        System.out.print(Number+" ");
        Number++;
    }
    System.out.println();
}
for(int i =1;i<=5;i++){
    for(int j=1; j<=i;j++){
        int sum=i+j;
        if(sum%2==0){
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
    }System.out.println();
}
        
    }
    
}
