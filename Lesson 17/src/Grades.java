//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Grades
{
	private Grade[] grades;

	public Grades(String gradeList)
	{
		grades = new Grade[Integer.parseInt(gradeList.split(" ")[0])];
		gradeList = gradeList.substring(4); // get rid of the first bit
		for(String s:gradeList.split(" ")) {
			addGrade(Double.parseDouble(s));
		}
	}

	public void addGrade(double grade) {
		for (int i = 0; i < grades.length; i++)
			if (grades[i] == null) {
				grades[i] = new Grade(grade);
				break;
			}
	}

	public void setGrade(int spot, double grade)
	{
		grades[spot] = new Grade(grade);
	}

	public double getSum()
	{
		double sum=0.0;
		for(Grade i:grades) sum+=i.getNumericGrade();
		return sum;
	}

	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(Grade i:grades) if(i.getNumericGrade() < low) low = i.getNumericGrade();
		return low;
	}

	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(Grade i:grades) if(i.getNumericGrade() > high) high = i.getNumericGrade();
		return high;
	}

	public int getNumGrades()
	{
		return grades.length;
	}

	public String toString()
	{
		String output="";
		for(Grade i:grades) output += i.getNumericGrade() + " ";
		return output;
	}
}