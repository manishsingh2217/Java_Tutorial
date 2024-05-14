package JavaBasic;
public class cwm5_string
{
    public static void main(String[] args)
    {
        //        first way to assign string variable
        String name = new String("Manish");
        System.out.println(name);

        //        second way
        String name1="Manish ";
        System.out.println("name1");

//          different way to print in Java
         int num1=5;
         float num2=3.8f;
         char c= 'm';
        System.out.print("Manish Singh");   // print with a  line
        System.out.println(num1);   // print without a line
        System.out.printf("the number in integer is %d and float is %.2f and character is %c  ",num1,num2,c);


    }
}
