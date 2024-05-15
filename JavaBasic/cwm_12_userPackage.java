// here we will call user defined package
package JavaBasic;
import JavaBasic.OppsJava.calculate;
import java.util.Scanner;

public class cwm_12_userPackage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a =sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();

       calculate calc= new calculate();   // creating object of hello class
        System.out.println("sum of number is "+calc.add(a,b));  // calling add class of OppsJava package
        System.out.println("Difference of number is "+calc.difference(a,b));  // calling difference class of OppsJava
        // package
        System.out.println("product of number is "+calc.product(a,b)); //calling product class of OppsJava package
    }
}
