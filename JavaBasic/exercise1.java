// Making CBSE board result % calculator
package JavaBasic;
import java.util.Scanner;
public class exercise1
{
    int totalNum=100;
    int science,math,hindi,english,sst;

//    new function
    public  void ResultCalculate() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number in science : ");
        science = inp.nextByte();

        System.out.print("Enter the number in math : ");
        math = inp.nextByte();

        System.out.print("Enter the number in hindi : ");
        hindi = inp.nextByte();

        System.out.print("Enter the number in english : ");
        english = inp.nextByte();

        System.out.print("Enter the number in sst : ");
        sst = inp.nextByte();

        float TotalMark = english + hindi + math + science + sst;
        float result = (totalNum * (TotalMark)) / 500;
        System.out.println(result);
    }

        public static void main(String []args)
        {
            exercise1 ex1=new exercise1();
            ex1.ResultCalculate();
        }

}
