public class insertionsort {
    public static void name(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        int arr[]={1,6,9,5,8,4};
for(int i=1;i<arr.length;i++){
    int curr=arr[i];
    int j=i-1;
    while(j>=0 && curr <arr[j]){
        arr[j+1]=arr[j];
        j--;
    }
    //placement
    arr[j+1]=curr;
}name(arr);
        
        
    }
}
