import java.io.*;

public class TestVariable
{
    public void PupAge()
    {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    // this instance variable is visible for any child class.
   public String name;
   // salary  variable is visible in Employee class only.
   private double salary;

   // The name variable is assigned in the constructor.
   public TestVariable (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   // salary  variable is a private static variable
   private static double salarytwo;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

    public static void main (String[] args)
    {
        //print out pupage
        TestVariable empOne = new TestVariable("Ransika");        
        empOne.PupAge();

        //printout sallary       
        empOne.setSalary(1000);
        empOne.printEmp();

        salarytwo = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salarytwo);
    }    
}
