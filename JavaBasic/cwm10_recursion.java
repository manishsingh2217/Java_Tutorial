package JavaBasic;
import java.util.Scanner;

class calculate {
    long factDig(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return (num) * factDig(num - 1);
    }


}


public class cwm10_recursion {
    //    function called itself is called recursion
    public static void main(String[] args) {
        int num;
        long result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        calculate obj = new calculate();
        result = obj.factDig(num);


        System.out.println("the factorial of the number is " + result);
    }

}
