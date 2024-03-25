import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestElement {
    static int[] smallestAndLargest(int [] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();

        int [] arr=new int[n];
      //  n= sc.nextInt();
        System.out.println("Enter "+ n + " elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      //  System.out.println("Enter x");
    //    int x=sc.nextInt();
        int[] ans=smallestAndLargest(arr);
        System.out.println("Smallest: "+ans[0]);
        System.out.println("Largest: "+ans[1]);
    }
}


