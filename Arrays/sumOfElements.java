class sumElements{
    void sum(){
        int [] arr={1,3,5};
        int sum=0;

       // System.out.println(arr[0]+arr[1]+arr[2]);

        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }

}

public class sumOfElements {
    public static void main(String[] args) {

        sumElements obj=new sumElements();
        obj.sum();

    }


}
