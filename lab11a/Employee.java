// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 

package lab11a;

public class Employee extends Person
{
	private double annualSalary;
	
	public Employee(String name,double annualSalary)
	{
		super(name);
		setAnnualSalary(annualSalary);
		
	}

	public double getAnnualSalary() 
	{
		return annualSalary;
	}

	@Override
	public String getDescription() 
	{
		return ("An employee with a salary of "+annualSalary);
	}

	public void setAnnualSalary(double annualSalary) 
	{
		this.annualSalary = annualSalary;
	}
	
	@Override
	public String toString()
  	{
  		return (super.toString());
  	}

}
