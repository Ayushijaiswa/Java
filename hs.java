import java.util.HashSet;
import java.util.Iterator;

public class hs {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
    //inssert
set.add(1);
set.add(2);
set.add(1);
//search contains
if(set.contains(1)){
    System.out.println("yes");
}
if(!set.contains(6)){
    System.out.println("no");
}  
System.out.println(set.size());
System.out.println(set);
//iterator
Iterator it=set.iterator();
//next :it++
//hasnext :true if there is value else not
while(it.hasNext()){
    System.out.println(it.next());
}
}
    
}
