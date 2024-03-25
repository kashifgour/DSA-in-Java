class maxElement{
    void max(){

        int arr[]={1,39,6,7,2};

        int ans=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans)
                ans=arr[i];
        }
        System.out.println(ans);
    }

}

public class maxOfArray {
    public static void main(String[] args) {
        maxElement obj = new maxElement();
        obj.max();

    }
}
