/*
 Constructor in java is used to invoke any class and meathod at its calling time
name of constructor is same as name of class and with no return type
 constructor can be parameterized or non parameterized
*/

package JavaBasic.OppsJava;

class testing{
    private String name;
    private int num;

    // making constructor method
    public testing(String n1,int n2)
    {
        name=n1;
        num=n2;
    }

    //returning name using get method
    public String getName() {
        return name;
    }

    // taking input using set method
    public void setName(String n){
        this.name=n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class cwm2_constructer {
    public static void main(String[] args)
    {
        // calling class with parameter constructor method
        // calling class with parameter constructor method
        testing cons = new testing("Manish1", 6);
        System.out.println(cons.getName());

        // setting name using set method
        cons.setName("Sahil singh");

        // setting number using set function
        cons.setNum(55);
        System.out.println(cons.getName()+ " " + cons.getNum());
    }
}
