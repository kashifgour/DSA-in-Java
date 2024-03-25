import java.util.Scanner;
public class SortArray {
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sortZerosAndOnes(int[] arr){
        int n=arr.length;
        int zeros=0;
        // count the number of zeros
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        // 0 to zeros-1: 0 and zeros-1 to n-1: 1
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+ " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);

    }

}
