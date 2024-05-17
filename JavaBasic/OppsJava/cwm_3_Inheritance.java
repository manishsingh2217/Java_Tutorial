package JavaBasic.OppsJava;

// this is Base class
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void printMe(){
        System.out.println("I am in Base class");
    }
}

// all properties of Base class inherit in derived class
class derived extends base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class derivedChild extends derived{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

public class cwm_3_Inheritance
{
    public static void main(String[] args)
    {
            // we cannot access derived( Child) class object in Base( Parent ) class
            base b =new base();
            b.setX(5);
            System.out.println("I am in Base class and getting X"+" "+ b.getX());

            // setting x from derived class
            derived d = new derived();
            d.setX(4);
            System.out.println("I am in derieved class and setting x"+" "+d.getX());

            // here we are creating the object of Derived child class
           derivedChild dc = new derivedChild();
           dc.printMe();
           System.out.print("Accessed in Derived child class");
    }
}
