package JavaBasic.OppsJava;
import java.util.Random;
import java.util.Scanner;

// Class game used to play game
class Game{
     private int noOfGuess;
     int userNum ,genNum;

// Constructor of game class
    public Game()
    {
        Random random = new Random();
        noOfGuess=0;
        genNum = random.nextInt(101);
    }

// used to take user input
    public void takeUserInput() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
         userNum = sc.nextInt();
    }

// check if enter number is correct or not
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

// used to set no of guess
   void setNoOfGuess()
   {
        if (isCorrectNumber()==1)
        {
            noOfGuess++;
        }
   }

// used to get number of guess
    public int getNoOfGuess() {
        return noOfGuess;
    }
}


// main method class
public class exercise_2_GuessTheNumber
{
    public static void main(String[] args)
     {
         Game obj = new Game();    //instantation of game class

         // checking all condition of game
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