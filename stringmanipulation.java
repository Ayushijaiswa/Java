public class stringmanipulation{

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("object language");
        System.out.println("original string "+str);
        System.out.println("original string lenght"+str.length());
        for (int i=0;i<str.length();i++){
            int p=i+1;
            System.out.println("characteer at position"+p+"is"+str.charAt(i));
        }
        
        String aString=new String(str.toString());
        int pos=aString.indexOf("language");
        System.out.println(pos);
        str.insert(pos, "oriented");
        str.insert(6, " oriented");
        System.out.println(str);
        str.append("improves security");
        System.out.println(str);
    }

    
}
