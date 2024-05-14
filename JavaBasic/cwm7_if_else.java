package JavaBasic;
import java.util.Scanner;
public class cwm7_if_else
{
    public static void main(String[] args)
    {
          int num1,num2;
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :  ");
        num1=sc.nextInt();
        System.out.println("Enter the number 2 :  ");
        num2=sc.nextInt();

        // conditional if-else statment
        if(num1<num2)
        {
            System.out.print("Number 2 is greater than number 1 ");
        }
        else if(num1>num2)
        {
            System.out.println("Number 1 is Greater than Number 2 ");
        }
        else
        {
            System.out.println("Number1 and Number2 is equal");
        }
    }


}
