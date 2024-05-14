package JavaBasic;
import java.util.Scanner;
public class exercise6_Calculator
{
    public static void main(String[] args)
    {
        String symbol;
        int  Num1 , Num2;
        float result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1 : ");
        Num1= sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        Num2=sc.nextInt();

        System.out.println("Enter the operation you want to perform : ");
        symbol = sc.next();

        switch(symbol)
        {
            case "+":
                result=Num1+Num2;
                System.out.printf("The sum of number is %f ",result);
                break;


            case "-":
                result=Num1-Num2;
                System.out.printf("The difference of number is %f ",result);
                break;

            case "*":
                result=Num1*Num2;
                System.out.printf("The product of number is %f ",result);
                break;

            case "/":
                result=(float)(Num1/Num2);
                System.out.printf("The division of number is %f ",result);
                break;

            case "%":
                result=Num1%Num2;
                System.out.printf("The modulo of number is %f ",result);
                break;

            default:
                System.out.println("Wrong Input");

        }
    }
}
