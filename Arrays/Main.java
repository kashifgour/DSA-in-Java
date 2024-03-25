class ArraysExample{
    void demoArrays(){
        int [] ages=new int[3];
        float[] weight=new float[3];
       // String[] names=new String[3];
        String[] names={"Kashif", "Ahmad", "Gour"};

        ages[0]=35;
        ages[1]=12;
        ages[2]=20;
       // ages[5]=20;

       /* System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);*/

        // for loop

       /* for(int i=0; i<3; i++)
            System.out.println(ages[i]);*/

        // for each loop--> print fully array not partially array

       // for (int age: ages){
          //  System.out.println(age);}


         // while loop

        int i=0;
        while(i < 3){
            System.out.println(ages[i]);
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArraysExample obj=new ArraysExample();
        obj.demoArrays();
    }
}
