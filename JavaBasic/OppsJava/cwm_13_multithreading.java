/*
Multithreading in Java is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
*/

package JavaBasic.OppsJava;
// creating thread using thread class
class thread1 extends  Thread
{
       thread1 (String name)  // always use thread construtor to set the name of the thread
       {
           super(name);
       }
     public   void run()     // always use the run method to run any thread
     {
        System.out.println("Hello i am thread 1");
    }
}

class thread2 extends Thread
{
    thread2(String name)
    {
        super(name);
    }
            @Override
           public  void run()
            {
                System.out.println("I am thread 2");
                System.out.println("I am happy");
            }
}


public class cwm_13_multithreading
{
    public static void main(String[] args)
    {
        thread1 th1 = new thread1("Manish"); // setting name to thread 1
        thread2 th2 = new thread2("kallu");    //creating name to thread 2
        th1.start();
        th2.start();
        System.out.println("The name of thread 1 : " + th1.getName());   //getting the name of the thread1
        System.out.println("The name of thread 2 : " + th2.getName());  /* getting the name of the thread 2 */
        System.out.println("The id of the thread 1 is : "+ th1.threadId());
        System.out.println("The id of the thread 2 is : "+th2.threadId());
    }
}
