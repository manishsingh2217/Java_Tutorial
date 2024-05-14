package JavaBasic;
import java.util.Scanner;
public class Exercise8_sum_even
{
    public static void main(String[] args)
    {
        int number,sum=0;
        int i=1,j=10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till even sum want to add : ");
        number=sc.nextInt();

        while(i<=number)
        {
            sum=sum+(2*i);
            i++;
        }

        System.out.println(sum);


        //printing table of numbe rin reverse order
        while(j>0)
        {
            System.out.printf(" %d  X %d = %d \n",number,j,j*number);
            j--;
        }


    }
}