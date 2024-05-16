package JavaBasic.OppsJava;
import java.util.Random;
import java.util.Scanner;

class Game{
     private int noOfGuess;
     int userNum ,genNum;

    public Game()
    {
        Random random = new Random();
        noOfGuess=0;
        genNum = random.nextInt(101);
    }

    public void takeUserInput() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
         userNum = sc.nextInt();
    }

    public int isCorrectNumber() {
        if (userNum==genNum)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

   void setNoOfGuess()
   {
        if (isCorrectNumber()==1)
        {
            noOfGuess++;
        }
   }

    public int getNoOfGuess() {
        return noOfGuess;
    }
}

public class exercise_2_GuessTheNumber
{
    public static void main(String[] args)
     {
         Game obj = new Game();
        while(true)
        {
            obj.takeUserInput();
            if(obj.userNum>obj.genNum)
            {
                System.out.println("Your enter number is wrong and greater than Guess number ");
                obj.setNoOfGuess();
            }
            else if(obj.userNum<obj.genNum)
            {
                System.out.println("Your enter number is wrong and  less than Guess number ");
                obj.setNoOfGuess();
            }
            else
            {
                System.out.printf("You guess correct in %d chance",obj.getNoOfGuess());
                break;
            }
        }
     }
}