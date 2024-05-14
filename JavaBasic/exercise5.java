package JavaBasic;
import java.util.Scanner;
public class exercise5
{
    public static void main(String[] args)
    {
         String st;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in UpperCase : ");
        st=sc.nextLine();

        System.out.println(st.toLowerCase());
        System.out.println(st.replace(' ','_'));

    }
}
