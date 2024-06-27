package JavaBasic.OppsJava;

class Thread1 implements Runnable
{
    public  void run()
    {
        for(int i= 0; i<60; i++)
        {
            System.out.println("Hey rupali hey rupali pakad meri dali ");
        }
    }
}


class Thread2 implements Runnable
{

    public void run()
    {
        for(int j=0;  j<60; j++ )
        {
            System.out.println("YO YO BANTI RAPPER ");
        }
    }
}
public class cwm_14_Multithreading
{
    public static void main(String[] args)
    {
         Thread1 th1 = new Thread1();
         Thread load = new Thread(th1);

         Thread2 th2 = new Thread2();
         Thread load2 = new  Thread(th2);
    }
}
