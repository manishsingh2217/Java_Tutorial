package JavaBasic;
import java.util.Scanner;
public class exercise9_factorial
{
    public static void main(String[] args)
    {
        int number , i , sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        number = sc.nextInt();

        // using for loop+
        for(i=1; i<=number; i++)
        {
            sum=sum*i;
        }
        System.out.printf("Factorial of %d term is %d",number,sum);
    }
}
