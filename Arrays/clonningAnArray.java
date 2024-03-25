public class clonningAnArray {
    public static void main(String[] args) {
        int arr1[]={4,5,6,7,8,9};
        int n=arr1.length;

        int arr2[]=arr1.clone();
        arr2[0]=0;

        System.out.println("Original Array");
        for(int i=0;i<n;i++)
            System.out.print(arr1[i] + " ");

        System.out.println("\nCopied Array by clone method");
        for(int i=0;i<n;i++)
            System.out.print(arr2[i] + " ");

    }
}
