package JavaBasic.OppsJava;

class A{
    void  meth1(){
        System.out.println("I am meathod 1 of A");
    }
}

class B extends A{

    // overridding method A
    void meth1(){
        System.out.println("THis is method 1 of B");
    }

    void Meth2(){
        System.out.println("THis is method 2 of B");
    }
}

public class cwm_5_methodOverriding
{
    public static void main(String[] args)
    {
        // This will print Method 2 of B
        B b = new B();
        b.Meth2();

        // This will print method 1 of A
        A a = new A();
        a.meth1();

        // now overrriding method 1 of class A and replaced with method 2 of class B
        b.meth1();
    }
}
