import java.io.*;
import java.util.*;
public class sortedOrNot
{
    public static boolean check(int a[]) {
        boolean ans = true;
        for(int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1])
                ans = false;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = { 1, 2,1,3, 4 , 5};
        System.out.println(check(a));
    }
}