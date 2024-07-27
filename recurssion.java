public class recurssion {    public static boolean[] map=new boolean[26];

    public static void name(int i,int n,int sum) {
       if(i==n){
        sum+=i;
        System.out.println(sum);
return;
       }
        sum+=i;
        name(i+1,n,sum);
        System.out.println(i);
        
    }
   
    public static int fact(int n ) {
        if(n==1||n==0){
            return 1;
        }
     int fac=fact(n-1);
     int fact_n=n*fac;
     return fact_n;
        
    }
    public static void printfab(int a, int b, int k) {
        if(k==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfab(b,c,k-1);
        
    }
    public static void moveallx(String str,int idx,int count ,String newstring) {//move all x from string
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstring+='x';//newstring=newstring+x;
            }System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            moveallx(str, idx+1, count, newstring);
        }else{

            newstring+=currchar;
            moveallx(str,  idx+1,count, newstring);
        }
        
    }
    //rremove duplicate in a string
    
    public static void reemoveDuplicate(String stri,int idxi,String newstri) {
        if(idxi==stri.length()){
            System.out.println(newstri);
            return;
        }
        char currichar=stri.charAt(idxi);
        if(map[currichar-'a']==true){
            reemoveDuplicate(stri, idxi+1, newstri);
        }else{
            newstri+=currichar;
            map[currichar-'a']=true;
            reemoveDuplicate(stri, idxi+1, newstri);
        }
        
    }
        
    
    public static void main(String args[]) {
        name(1,5,0);
        int n=5;
      int ans=  fact(n);
        System.out.println(ans);
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int k =7;
        printfab(a,b,k-2);
    String str="axbcdxx";
        moveallx(str, 0, 0, "");
        String stri="abccdda";
        reemoveDuplicate(stri, 0, "");}
}


