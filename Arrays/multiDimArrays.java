class multiDimArraysEX{
    void multiDimArrays1() {
        // int [][] arr_1=new int[5][3];
        int[][] arr1 = {{22, 45, 21}, {53, 67, 12}, {16, 75, 29}};

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);

        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);

        System.out.println(arr1[2][0]);
        System.out.println(arr1[2][1]);
        System.out.println(arr1[2][2]);

        //  System.out.println(arr1.length);

    }

}
public class multiDimArrays {
    public static void main(String[] args) {

       multiDimArraysEX obj=new multiDimArraysEX();
       obj.multiDimArrays1();

    }

}
