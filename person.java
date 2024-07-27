public class person {
    int ahdarno;
    String name;
    String panno;

    person(int x,String y,String p){
        ahdarno=x;
        name=y;
        panno=p;
        System.out.println(x+""+""+y+""+p);
    }
    person(int x,String y){
        ahdarno=x;
        name=y;
        System.out.println(x+""+y);
    }
    person(String n,String p){
        name=n;
        panno=p;
        System.out.println(n+""+p);
    }
    person(String p,int x){
        panno=p;
        ahdarno=x;
System.out.println(p+""+x);
    }
   
   public static void main(String[] args) {
    person p1=new person(21000, "khushi");
    person p2=new person("khushi","cjwo910");
    person p3=new person(3901111, "khushi", "cjwp0982");
    person p4=new person("67y2ooop", "ansh");
    person p5=new person(387000, "vijay");

    

   }
    

    
}
