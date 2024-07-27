import java.util.HashSet;

public class rec {
    public static String[] keypd={"." , "abc","def","ghi","jkl"," mno","pqrs","tu","vwx","yz"}; 
    public static int calPower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }//for  stack height n
      //  int xpow=calPower(x,n-1);
//int xpown=x*xpow;
//return xpown;}
if(n%2==0){//for even
    return calPower(x,n/2)*calPower(x,n/2);

}
else{//for odd
    return calPower(x,n/2)*calPower(x, n/2)*x;
}
    }
    public static void sequence(String str,int idx,String newstring,HashSet<String> set) {//subsequence o2^n
        if(idx==str.length()){
           // System.err.println(newstring);
           // return;//for subseuence
           //for uniquesubsequence
           if(set.contains(newstring)){
            return;
           }else{
            System.out.println(newstring);
            set.add(newstring);
            return;
           }
            }
        

        char currchar=str.charAt(idx);
        sequence(str, idx+1, newstring+currchar,set);
        sequence(str, idx+1, newstring,set);
        
    }
    //making keypad combination
    
        public static void printcomb(String stri,int idxi, String combin ) {
            if(idxi==stri.length()){
                System.out.println(combin);
                return;
            }
            char currchar=stri.charAt(idxi);
            String mapping=keypd[currchar-'0'];
            for(int i=0;i<mapping.length();i++){
                printcomb(stri, idxi+1, combin+mapping.charAt(i));
            }
            
        }

        
    

    
public static void main(String args[]) {
    int x=2,n=5;
    int ans=calPower(x,n);
    System.out.println(ans);
    String str="aaa";//subsequence abc ka niklna h
    HashSet<String> set=new HashSet<>();
    sequence(str, 0, "",set);
    String stri="23";
    printcomb(stri, 0, "");
    
}
}



















    
    

