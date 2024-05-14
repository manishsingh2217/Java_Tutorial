package JavaBasic;
import java.util.Scanner;
public class Exercise4
{
    public static void main(String[] args) {
        int v,u,a;
        float result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter initial speed : ");
        u=sc.nextInt();

        System.out.println("Enter final speed : ");
        v=sc.nextInt();

        System.out.println("Enter accelration : ");
        a=sc.nextInt();

        result =(float)((v*v) - (u*u))/2*a;
        System.out.println(result);

    }
}
