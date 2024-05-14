package JavaBasic;
import java.util.Scanner;
public class exercise7_Star_Pattern
{
    public static void main(String[] args)
    {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line : ");
            line = sc.nextInt();
        int i,j;
        for (i=0; i<=line;  i++)
        {
            for (j=line; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
