package JavaBasic.Projects.EmployPayrolSystem;
import java.util.ArrayList;
import java.util.Scanner;

abstract  class Employee
{
    private String name;
    private int id;

//    for assigning name and id to employee
    public Employee(String name , int id)
    {
        this.name= name;
        this.id=id;
    }

//    for input the name
    public String getName()
    {
        return name;
    }

//    for input ID

    public  int getId()
    {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString()
    {
        return "Employee [name "+name+" ,id= "+id+ ",salary "+calculateSalary()+"]";
    }
}

class fullTimeEmploy extends Employee
{
    public double monthlySalary;

    public fullTimeEmploy(String name, int id,double monthlySalary)
    {
        super(name, id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary()
    {
        return monthlySalary;
    }
}


class partTimeEmployee extends Employee
{
    private int hrsWork;
    private double hourlyRate;
    public partTimeEmployee(String name ,int id ,int hrsWork,int hourlyRate)
    {
        super(name, id);
        this.hrsWork=hrsWork;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return hrsWork*hourlyRate;
    }
}

class PayrollSystem
{
//    making list of Employ type
    private ArrayList<Employee> employeesList;

    public PayrollSystem()
    {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employeesList.add(employee);
    }

    public void removeEmployee(int id)
    {
        Employee employeeToRemove = null;
        for(Employee employee : employeesList)
        {
            if(employee.getId()==id)
            {
                employeeToRemove = employee;
                break;
            }
        }

        if(employeeToRemove !=null)
        {
            employeesList.remove(employeeToRemove);
        }
    }

    public void displayEmploy()
    {
        for(Employee employee : employeesList)
        {
            System.out.println(employee);
        }
    }

}

public class Main
{
    public static void main(String[] args)
    {
            PayrollSystem payrollSystem = new PayrollSystem();
            Scanner sc =new Scanner(System.in);
        int choice=5;
             while(choice!=0)
             {
                 System.out.println("1.To Add an  Full time Employee. \n 2. To Add an Part Time Employee. \n 3.To " +
                         "Remove an Employee \n 4. To Display Employees Details. \n 0.Exit");
                 choice = sc.nextInt();

                 switch (choice)
                 {

                     //need to some changes in case 1 2
                     case 1:
                         System.out.println("Enter the employee  Name");
                         String Name = sc.nextLine();
                         System.out.println("Enter the employee ID ");
                         int Id = sc.nextInt();
                         System.out.println("Enter the employee ,Salary");
                         double Salary = sc.nextDouble();
                         fullTimeEmploy emp1 = new fullTimeEmploy(Name,Id,Salary);
                         payrollSystem.addEmployee(emp1);
                         System.out.println("Employee  Added");
                          break;

                     case 2:
                         System.out.println("Enter the employee Name,ID ,Working Hours,Hourly rate ");
                         partTimeEmployee emp2 =new partTimeEmployee("Manish",12,2,1200);
                         payrollSystem.addEmployee(emp2);
                         System.out.println("Employee Added");
                         break;

                     case 3:
                         System.out.println("Enter the ID of Employee you want to remove :");
                         int ID= sc.nextInt();
                         payrollSystem.removeEmployee(ID);
                         System.out.println("Employee Removed");
                         break;

                     case 4:
                         payrollSystem.displayEmploy();
                         break;

                     default:

                         System.out.println("Wrong Input");
                          break;
                 }
             }
    }
}
