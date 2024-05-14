package OppsJava;
class employee{
        int salary;
        String name;

         public int getSalary()
         {
            return salary;
         }

         public String getName()
         {
           return name;
         }

        public void setName(String n1)
        {
           name=n1;
        }
}

public class exercise_1 {
    public static void main(String[] args) {
        // Employee 1
        employee manish = new employee();
        manish.setName("Manish singh");
//        manish.name="sah";
        System.out.println(manish.getName());

        manish.salary=50000;
        System.out.println(manish.getSalary());
    }
}
