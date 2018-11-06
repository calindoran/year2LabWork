// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A subclass of Person

package lab10;

public class Teacher extends Person
{
	private int numCourses;
	private String[] courses;
	
	public Teacher(String name,String address,int numCourses,String[] courses)
	{
		super(name,address);
		setNumCourses(numCourses);
		setCourses(courses);
	}
	public boolean addCourse(String course)
	{
		return true;
	}
	public String[] getCourses() 
	{
		return courses;
	}
	public int getNumCourses() 
	{
		return numCourses;
	}
	public boolean removeCourse(String course)
	{
		return true;
	}
	public void setCourses(String[] courses) 
	{
		this.courses = courses;
	}
	public void setNumCourses(int numCourses) 
	{
		this.numCourses = numCourses;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Number: "+numCourses+"Course: "+courses;
	}

}
