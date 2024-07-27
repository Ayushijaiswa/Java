import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //add element
        list.add(0);
       
        list.add(1);
        list.add(4);
        System.out.println(list);
        //get elemnt pass index
      int element=  list.get(0);
System.out.println(element);
//add elemnt in between
list.add(1,5);
System.out.println(list);
//set element
list.set(0, 8);
System.out.println(list);
//delete element
list.remove(3);
System.out.println(list);
//count elemnt or size of arraylist
int size=list.size();
System.out.println(size);
//iterate or for loop on araylist
for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
}
//sorting
Collections.sort(list);
System.out.println(list);

        
    }
    
}
