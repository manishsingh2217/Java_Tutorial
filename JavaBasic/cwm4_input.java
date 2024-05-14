package JavaBasic;
import java.util.Scanner;
public class cwm4_input
{
    public static void main(String []arg)
    {
        System.out.println("Taking the input from user : ");
        Scanner  inp = new Scanner(System.in);

        System.out.println("Enter the number : ");
        float a =inp.nextFloat();
        System.out.println("Enter second number : ");
        float b = inp.nextFloat();
        float c= a+b;
        System.out.println(c);
    }
}
