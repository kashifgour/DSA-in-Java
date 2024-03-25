import java.util.*;
import java.lang.*;
public class PresentQuery {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
            int n=sc.nextInt();
            int[] a = new int[n];

        System.out.println("Enter" +n+ " elements");
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int N = 100100;
// creating a frequency array as max(a[i]) < 105
            int[] freq = new int[N];
            for (int i = 0; i < n; i++) {
                freq[a[i]] = freq[a[i]] + 1;
            }
            int q;
            q = sc.nextInt();
            while (q-- > 0) {

                System.out.println("Enter Number to be searched");
                int x=sc.nextInt();
                if (freq[x] > 0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        }

    }



