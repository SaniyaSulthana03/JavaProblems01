
// import java.util.Scanner;
public class jaggedArray 
{
    public static void main(String[] args) 
    {
        int[][] array = new int[4][];
        array[0]=new int[]{1,2,3,4};
        array[1]=new int[]{2,3,4};
        array[2]=new int[]{2,3,4,5,6};
        array[3]=new int[]{2,3};

        for(int i=0;i<array.length;i++)
        {
            //for(int numbers)
            System.out.printf("%3d",array[i][j]);
            System.out.println();
        }
        int[][][ ]arr={{{},{},{}},
                      {{},{},{}},        //three dimensional arrays
                      {{},{},{}}};
    }
}
