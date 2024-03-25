public class arrayReference {
    public static void main(String[] args) {
        int arr1[]={5,6,7,8,9};
        int n=arr1.length;
        int arr2[]=new int[n];
        arr2=arr1;
        arr2[0]=0;

        System.out.println("Original Array");
        for(int i=0;i<n;i++)
            System.out.print(arr1[i] + " ");
        System.out.println("\nReferenced Array");

        for(int i=0;i<n;i++)
            System.out.print(arr2[i] + " ");

    }
}
