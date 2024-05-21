/*
We can use multiple catch to solve specific error thrown by program
At a time only one exception occurs and at a time only one catch block is executed
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
 */
package JavaBasic.exceptionHandeling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class cwm2_multipleCatch
{
    public static void main(String[] args) {

        try {

            int[] arr,arr2;
            arr = new int[5];
            arr2=new int[5];
            for (int i = 0; i < 5; i++)
            {
                arr[i] = i + 5;
            }
            System.out.println(arr[10]);

            for(int j = 0; j<5; j++){
                Scanner sc = new Scanner(System.in);
                arr2[j]=sc.nextByte();
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound exception" +" " + e);
        }
        catch (InputMismatchException f)
        {
            System.out.println("Input mismatch error "+ " "+f);
        }

    }
}