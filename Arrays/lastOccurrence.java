import java.util.Scanner;

public class lastOccurrence {
    static int lastOccurrence(int[] arr, int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();

        int [] arr=new int[n];
       // n= sc.nextInt();
        System.out.println("Enter "+ n+ "elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x");
        int x=sc.nextInt();

        System.out.println("Last Occurrence Of X: "+lastOccurrence(arr,x));
    }

}
