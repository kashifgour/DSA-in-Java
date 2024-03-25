import java.util.Scanner;

public class RepeatingNumber {
    static int firstRepeatNumber(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){ // first number pick and traverse array
            for(int j=i+1;j<n;j++){ // second number
                if(arr[i]==arr[j]){ // found answer
                    return arr[i];
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+ " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Repeating Number: "+firstRepeatNumber(arr));
    }
}
