public class classnobject {
    int l;
    int w;
    void data(int x,int y){
        l=x;
        w=y;
    }
   
    int reactarea(){
        int area=l*w;
        return area;

    }
    public static void main(String[] args) {
        int area1,area2;
classnobject rect1= new classnobject();
rect1.data(20, 40);
area1=rect1.reactarea();
System.out.println(area1);
    }
    
}
