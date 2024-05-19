// we cannot create the instance variable of abstract class
// the abstract method should not contain any statment and must be declared in abstract class
package JavaBasic.OppsJava;

// the abstract class contain abstract method
abstract class test
{
    // abstract method must not have any statments
        abstract public void greet();

        test()
        {
            System.out.println("I am test class constructer");
        }

        public void greet1()
        {
            System.out.println("this is greet 1");
        }
}

//abstract method must be use by extending it
class result extends test
{
    // defining abstract method and must must be defined in his extended class
    public void greet()
    {
        System.out.println("Calling greet in result class");
    }
}

public class cwm6_abstractClass
{
    public static void main(String[] args)
    {
        result r = new result();
        r.greet();
        r.greet1();
    }
}
