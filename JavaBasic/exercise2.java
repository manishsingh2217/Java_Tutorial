package JavaBasic;

import java.util.Scanner;

public class exercise2 {


    //    new function
    public static void main(String[] args) {

        int totalNum;
        int science, math, hindi, english, sst;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Maximum marks of 5 subjects :  ");
        totalNum = inp.nextInt();

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
        float result = (100 * (TotalMark)) / totalNum;
        System.out.println(result);
    }
}