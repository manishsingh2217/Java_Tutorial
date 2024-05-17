package JavaBasic.OppsJava;

class Base1
{
      Base1()
      {
          System.out.println("I am Base constructor");
      }

      Base1 (int x){
          System.out.println("The value of X is " + x);
      }
}

class derived1 extends Base1{
    derived1(){
        super(3);   // it will inherit the parametrized constructor
        System.out.println("I am derived class constructor");
    }
}

public class cwm_4_ConstructerInheritance
{
    public static void main(String[] args)
    {
        derived1 d = new derived1();
    }
}
