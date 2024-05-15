package JavaBasic;
import java.util.Random;
import  java.util.Scanner;

public class exercise_14_RockPaperScissor {
    public static void main(String[] args) {
        int user ,computer;
        // 0 for paper
        // 1 for scissor
        //  2 for rock

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 0 for paper  Enter 1 for Scissor  Enter 2 for Rock : ");
        user = inp.nextInt();

        Random rInp= new Random();

        computer = rInp.nextInt(3);
        System.out.printf("The computer enter is %d \n", computer);
        if(user==computer)
            System.out.println("Match draw ");
        else if (user==2 && computer==1 || user==1 && computer==2 || user==0 && computer==2) {
            System.out.println("You winn !!!");
        }
        else
            System.out.println("Computer win");
    }
}
