/*
Java try block is used to enclose the code that might throw an exception. It must be used within the method.
Java catch block is used to handle the Exception by declaring the type of exception within the parameter
 */

package JavaBasic.exceptionHandeling;

public class cwm1_tryCatch
{
    public static void main(String[] args)
    {
            int a=5,b=0;
            int result;

//            it will try to solve the error
            try{
                result = a/b;
                System.out.println(result);
            }
//            if error  will not solve then it will give msg witten in catch block
            catch(Exception e){
                System.out.println(" Cannot resolve the error because  "+e );
            }
    }
}
