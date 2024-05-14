package JavaBasic;
import java.util.Scanner;
public class cwm_11_array {
    public static void main(String[] args) {
        // Type 1
        String[] array;    // declaration of array
        array = new String[5];   // memory allocation of array

        // Type 2
        String[] array1 = new String[20];   // declaration and memory allocation
        array1[0] = "Manish";    // Initialization of array
        System.out.println(array1[0]);    // printing the array of index 0
        System.out.println(array1.length);

        // initialize array with loop
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the %d name of Student : ", i + 1);
            array[i] = sc.nextLine();
        }

        // first way to access array
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Student  : " + array[i]);
        }

        // second way and efficient way to access array
        for (String s : array) {
            System.out.println(s);
        }

    }
}
