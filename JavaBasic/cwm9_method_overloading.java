package JavaBasic;
public class cwm9_method_overloading
{
    /*
    method overloading  means method have same name but different functionality
    */

    static void greet()
    {
        System.out.println("hello good morning");
    }

    static void greet(int a)
    {
        int i;
        for (i=0; i<=a; i++)
            System.out.println("hello good morning");
    }


    static void greet(int a,int b)
    {
        int i;
        for (i=0; i<=(a+b); i++)
            System.out.println("hello good morning");
    }


    public static void main(String[] args)
    {
        System.out.println("Method 1");
        greet();

        System.out.println("Method 2");
        greet(3);

        System.out.println("Method 3");
        greet(2,5);
    }
}
