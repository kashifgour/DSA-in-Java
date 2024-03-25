public class SwapWithoutUsingTemp {
    static void swap(int a,int b ){
        System.out.println("Original Values before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // a=9, b=3
        a=(a+b); //12
        b=(a-b); //12-3=9  , operation from left to right
        a=(a-b); //12-9=3

        // a=3, b=9
        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        int a=9 ,b=3;

        swap(a,b);
    }
}
