/*
 The interface class contain the method and properties that is final and use by implement keyword
 it cannot be declared as instance variable
 it is declared using interface keyword and implement using implement keyword
 in the implement class the method must be public
*/

package JavaBasic.OppsJava;

interface test1
{
      void name(String name);
      void height(int x);
}

//implementing test1 in result
class result1 implements test1{
    public void name (String name)
    {
        System.out.println("this is my name"+" "+name);
    }

    public  void height (int x)
    {
        System.out.println("this is my height "+" "+x);
    }
}

public class cwm7_interface
{
    public static void main(String[] args)
    {
        result1 r1=new result1();
        r1.height(4);
        r1.name("Manish singh");
    }
}
