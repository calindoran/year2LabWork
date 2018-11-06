// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A superclass Person

package lab10;

public class Person 
{
   // Instance variables
   private String name;
   private String address;
   
   // Constructor
   public Person(String name, String address) 
   {
      this.name = name;
      this.address = address;
   }
   
   public String getAddress() 
   {
      return address;
   }
   // Getters
   public String getName() 
   {
      return name;
   }
   
   @Override
public String toString() 
   {
      return name + "(" + address + ")";
   }
}
