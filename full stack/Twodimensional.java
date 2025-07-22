import java.util.Scanner;
public class Twodimensional {
    public static void main(String[] args){
        int [][] arr={{1,2,3},{2,3,4},{4,5,6},{5,6,7}};
        int m=arr.length;   //number of rows
        int n=arr[3].length;   //take any row to find its length
        System.out.println("m: " + n);
        for(int i=0;i<m;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%4d",arr[i][j] + " ");
            }
              System.out.println();
        }
    
    }
}
