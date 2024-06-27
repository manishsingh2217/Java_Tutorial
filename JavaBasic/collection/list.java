package JavaBasic.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class list
{
    public static void main(String[] args)
    {
//        linked list without generic class
        LinkedList L1= new LinkedList();
        L1.add(12);
        L1.add("Alok");
        L1.add(13.5f);
        L1.add("Siddhu");
        L1.add(true);
        L1.add(0,"Manish at 0");
        System.out.println(L1);
        // Linked list with generic class

        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(22);
        L2.add(29);
        L2.add(25);
        L2.add(44);
        L2.add(24);
        L2.add(1,6);
        System.out.println(L2);
        for(Integer item:L2)
        {
            System.out.println("Element : "+item);
        }

        Iterator <Integer> itr = L2.iterator();
        while(itr.hasNext())
        {
            int a =itr.next();
            System.out.print(a+" ");
        }
    }
}
