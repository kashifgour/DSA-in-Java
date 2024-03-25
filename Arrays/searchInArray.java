class searchElement{
    // Linear Search
    void search(){
        int arr[]={1,4,6,2,3,6,2};
        int x=2;
        int ans=-1;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==x){
                ans=i;
                break;
            }
        }

        System.out.println("Found "+ x + " at index " +ans);
    }
}

public class searchInArray {
    public static void main(String[] args) {
        searchElement obj=new searchElement();
        obj.search();

    }
}
