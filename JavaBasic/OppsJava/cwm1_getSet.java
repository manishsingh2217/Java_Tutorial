package JavaBasic.OppsJava;

class access
{
    // cannot access directly by (.) operator and use to protect data
     private int num;
     private String name;

   // private can be access using get and set
   public int getNum(){
       return  num;
   }

   public String getName(){
       return name;
   }

   public void setNum(int n){
       num=n;
   }

   public void setName(String n1){
       name=n1;
   }
}

public class cwm1_getSet
{
    public static void main(String[] args)
    {
        access a1 = new access();
        a1.setName("Manish singh");     // setting value to name
        a1.setNum(50);     // setting value to number
        System.out.println(a1.getName()+a1.getNum());
    }
}
