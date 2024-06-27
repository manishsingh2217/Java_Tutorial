package JavaBasic.collection;
import java.util.*;

public class Collection
{
    public static void main(String[] args) {
        // Stack without generic class
        Stack s= new Stack();
        s.push("Manish");
        s.push(12.6);
        s.push(12);
        s.push(true);
        System.out.println(s);
        System.out.println("Total item "+s.size());
       Object a= s.pop();
        System.out.println(a);
        System.out.println(s);


        // Stack with generic class
        Stack <String> s1 = new Stack<>();
        s1.push("MAnish");
        s1.push("Kallu");
        s1.push("Singh");
        s1.push("Sahil");
        s1.push("Rana");
//        s1.push(22);   it will through error
        System.out.println(s1);

    }
}
