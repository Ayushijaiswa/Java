public class ll {
     static Node head;
    class  Node{
        
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add first ,last
    public  void addfirst(String data) {
        Node newnode=new Node(data);
        if(head ==null){
            head=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;
    }
    
    public static void addlast(String data) {
        
        Node newnode=new Node(data);
if(head==null){
    head=newnode;
    return;
}
        
    
    Node currnode=head;

    while(currnode!=null){
        currnode=currnode.next;

    }currnode.next=newnode;
}

public void printlist() {
    if(head==null){
        System.out.println("empty list");
        return;
    }
    Node currnode=head;
    while(currnode.next!=null){
        System.out.println(currnode.data +"");
        currnode=currnode.next;

    }System.out.println("null");


    
}
    public static void main(String args[]) {
        ll list=new ll();
        list.addfirst("a");
        list.addfirst("is");

        list.printlist();
    }
    
}
