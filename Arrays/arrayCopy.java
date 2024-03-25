import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class arrayCopy {
    public static void main(String[] args) {
        int arr1[]={4,5,6,7,8,10};
        int n=arr1.length;

        int arr2[]=Arrays.copyOf(arr1,arr1.length);
        arr2[0]=10;

        System.out.println("original Array");
        for(int i=0;i<n;i++)
            System.out.print(arr1[i]+ " ");

        System.out.println("\nCopied Array by copyOf()");
        for(int i=0;i<n;i++)
            System.out.print(arr2[i]+ " ");

        // Arrays.copyOfrange()
        int arr3[]=Arrays.copyOfRange(arr1,0,6);
        arr3[3]=23;
        arr3[4]=21;

        System.out.println("\ncopyOfRange");
        for(int i=0;i<n;i++)
            System.out.print(arr3[i]+ " ");

    }


}
