package JavaBasic;
import java.util.Scanner;
  class algebra
{
    /* declaration of method
    accessModifier returnType methodName(Parameter)
    {
         method body
    }
 */
        int sum(int a ,int b)
    {
        return a+b;
    }

    /*
    calling method
    method();
    */
}

public class cwm8_methods
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a=sc.nextInt();
        System.out.print("Enter the second number : ");
        b=sc.nextInt();
        algebra obj =new algebra();
        c=obj.sum(a,b);
        System.out.println(c);
    }
}
