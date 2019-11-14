/**
 * INI NAMANYA JAVA DOC ?
 * TEST AJA SIH
 * TEST TEST TEST CENDOL DAWET JOS
 */

    class Base
    {
         public void Display()
         {
             System.out.println("Base display()");
         }     
         public static void main(String args[])
         {
            //Base t1 = new Base();
             Base t1 = new Derived();
             //Derived t1 = new Derived();
             //Derived t1 = new Base();
             
             t1.Display();
         }    
    }
    class Derived extends Base
    {
         @Override
         public void Display()
         {
             System.out.println("Derived display()");
         }
    }