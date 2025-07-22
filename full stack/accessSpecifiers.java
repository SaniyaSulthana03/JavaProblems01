import java.util.Scanner;

public class accessSpecifiers 
{
    System.out.println("enter the number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i =0;i<number;i++)
    {
        if(number % i ==0){
            System.out.println(i);
        }
        else{
            System.out.println("not a prime");
        }

    }
    System.out.println(i);
}
   
