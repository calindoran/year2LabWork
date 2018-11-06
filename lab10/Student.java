// Author 			: Calin Doran
// Date 			: 2017
// Purpose 			: A subclass of person

package lab10;

public class Student extends Person
{
	private int numCourse;
	private String[] course;
	private int[] grades;
	
	public Student(String name,String address,int numCourse,String[] course,int[] grades)
	{
		super(name,address);
		setNumCourse(numCourse);
		setCourse(course);
		setGrades(grades);
	}
	public void addCourseGrade(String course,int grade)
	{
		
	}
	public double getAverageGrade(double grades)
	{
		return grades;
	}
	public String[] getCourse() 
	{
		return course;
	}
	public int[] getGrades() 
	{
		return grades;
	}
	public int getNumCourse() 
	{
		return numCourse;
	}
	public void printGrades()
	{
		
	}
	public void setCourse(String[] course) 
	{
		this.course = course;
	}
	public void setGrades(int[] grades) 
	{
		this.grades = grades;
	}
	public void setNumCourse(int numCourse) 
	{
		this.numCourse = numCourse;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Number: "+numCourse+"Course: "+course+"Grade: "+grades;
	}

}
