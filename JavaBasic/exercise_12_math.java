package JavaBasic;
import java.util.Scanner;
public class exercise_12_math
{
    public static void main(String[] args)
    {
        int totalStu, a_grade, Aboys, Agirls;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total numbert of Student : ");
        totalStu = sc.nextInt();

        a_grade=totalStu/2;

        System.out.printf("Student get A grade is %d  \n",a_grade);
        System.out.println("Enter number of boys get A Grade : ");
        Aboys=sc.nextInt();
         Agirls=a_grade-Aboys;

        System.out.print("The number of girls get A grade is "+Agirls);

    }
}
