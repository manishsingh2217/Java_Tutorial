package JavaBasic;
import java.util.Scanner;

class array {
    void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;}
            }
        }
    }
}


public class exercise_13_sorting {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        array obj = new array();
        obj.sorting(arr);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}