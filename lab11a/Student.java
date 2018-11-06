// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: 

package lab11a;

public class Student extends Person
{
	private String course;
	
	public Student(String name, String course)
	{
		super(name);
		setCourse(course);
	}

	public String getCourse() 
	{
		return course;
	}

	@Override
	public String getDescription() 
	{
		return ("A student studying "+course);
	}
	
	public void setCourse(String course) 
	{
		this.course = course;
	}
	
	@Override
	public String toString()
  	{
  		return (super.toString());
  	}

}
