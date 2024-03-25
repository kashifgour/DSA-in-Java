import java.util.Scanner;

public class pairSum {

    static int PairSum(int[] arr, int target){
        int n=arr.length;
        int ans=0;

        for(int i=0;i<arr.length;i++)  // pick first element
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){ // second number
                    ans++;
                }

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter " + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum ");
        int target=sc.nextInt();

        System.out.println(PairSum(arr,target));
    }

}
