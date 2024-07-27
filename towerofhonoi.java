public class towerofhonoi {
    public  static int first=-1;
        public static int last=-1;
    public static void towerOfHonoi(int n, String src,String helper,String dest) {
        if(n==1){
            
        System.out.println("transfer disk no "+n +"from"+src+"to"+dest);
        return;}
        towerOfHonoi (n-1,src,dest,helper);
        System.out.println("transfer disk no "+n +"from"+src+"to"+dest);
        towerOfHonoi  (n-1,helper,src,dest);
    }
    public static void rev(String str,int idx) {
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
        
    }
    public static void occur(String stri,int idx,char elem) {
        
            if(idx==stri.length()){
                System.out.println(first);
                System.out.println(last);
                return;
            }
        
        char currchar=stri.charAt(idx);
        if(currchar==elem){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occur(stri,idx+1,elem);
    }
    public static boolean issorted(int arr[],int idxi) {
        if(idxi==arr.length-1)
        {return true;}
        if(arr[idxi]>=arr[idxi+1])
        {
          return false;
        }
        else{
            return issorted(arr, idxi+1);
        }
        
    }
    
    public static void main(String args[]) {
        int n=6;
        towerOfHonoi (n,"S","H","D");
        String str="abcd";111111111         
        rev(str,str.length()-1);
        String stri="abaacdegfaah";
        occur(stri,0,'a');
        int arr[]={1,2,3,4,5};


System.err.println(issorted(arr, 0));
    }
}
